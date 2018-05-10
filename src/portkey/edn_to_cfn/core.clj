(ns portkey.edn-to-cfn.core
  (:require [cheshire.core :as cheshire]
            [expound.alpha :as expound]
            [clojure.spec.alpha :as s]
            [clojure.walk :refer [prewalk]]
            [portkey.cloudformation :as cfn]
            [clojure.string :as str]))


(defprotocol Prepare
  (to-cfn [this root]))

(extend-protocol Prepare
  portkey.cloudformation.Ref
  (to-cfn [{name :name} root]
    {"Ref" name}))

(def ^:private special-key-name
  {::cfn/template-format-version "AWSTemplateFormatVersion"})

(defn- cfn-key [kw]
  (or (special-key-name kw)
      (reduce str (map str/capitalize
                       (str/split (name kw) #"-")))))

(defn- process-resource [resource]
  {:type (::cfn/type resource)
   :properties (dissoc resource ::cfn/type ::cfn/id)})

(defn- expand-resources
  "Takes list of resource like and expands them to a single list."
  [resource-likes]
  (mapcat #(if (map? %)
             [%]
             (expand-resources %))
          resource-likes))

(defn- process-resources [edn]
  (update edn ::cfn/resources
          (fn [resources]
            (let [expanded-resources (expand-resources resources)
                  resources-by-id (group-by ::cfn/id expanded-resources)
                  duplicate-ids (filter #(> (count (second %)) 1) resources-by-id)]
              (when (seq duplicate-ids)
                (throw (ex-info (str "Duplicate resource ids found: " (str/join ", " (map first duplicate-ids)))
                                {:ids-and-resources duplicate-ids})))
              (into {}
                    (map (juxt ::cfn/id process-resource))
                    expanded-resources)))))

(defn- find-namespaces
  "Find all namespaces from keywords in the given data.
  Returns a set of unique namespace names."
  [edn]
  (cond
    (map? edn)
    (let [key-namespaces (into #{}
                               (comp (filter qualified-keyword?)
                                     (map namespace))
                               (keys edn))]
      (into key-namespaces
            (mapcat find-namespaces (vals edn))))

    (coll? edn)
    (into #{} (mapcat find-namespaces) edn)

    (qualified-keyword? edn)
    #{(namespace edn)}

    :else
    #{}))

(defn- require-namespaces
  "Require namespaces in the given edn data. This is used
  to ensure that all specs are loaded even if user hasn't
  required the namespace they are using."
  [edn]
  (doseq [ns-name (find-namespaces edn)
          :let [ns-sym (symbol ns-name)]]
    (try
      (require [ns-sym])
      (catch java.io.FileNotFoundException fnfe
        (throw (ex-info "Could not require namespace. Your data references a namespace that could not be required, please check that all qualified keywords are valid."
                        {:namespace ns-name
                         :exception fnfe}))))))



(defn edn->cfn
  "Given Clojure (EDN) data, returns a CloudFormation JSON
  document describing the resources.

  If the input data is not valid, an exception is thrown with
  the spec errors and the expound error message."
  [edn]
  (assert (map? edn) "Input must be a map!")
  (let [edn (merge edn cfn/template-defaults)]
    ;;(println "GOT EDN:\n" (pr-str edn) "\n-------------------")
    (require-namespaces edn)
    (if-not (s/valid? ::cfn/template edn)
      (throw (ex-info (expound/expound-str ::cfn/template edn)
                      {:explain-data (s/explain-data ::cfn/template edn)}))
      (cheshire/encode
       (->> edn
            process-resources
            (prewalk #(if (satisfies? Prepare %)
                        (to-cfn % edn)
                        %))
            (prewalk (fn [item]
                       (if (map? item)
                         (reduce-kv (fn [m k v]
                                      (assoc m (if (keyword? k)
                                                 (cfn-key k) k) v))
                                    {} item)
                         item))))
       {:pretty true}))))
