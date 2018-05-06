(ns edn-to-cfn.core
  (:require [cheshire.core :as cheshire]
            [expound.alpha :as expound]
            [clojure.spec.alpha :as s]
            [clojure.walk :refer [prewalk]]
            ;; Require specs for all AWS namespaces
            [edn-to-cfn.specs.aws]
            [edn-to-cfn.specs.cfn]
            [clojure.string :as str]))


(s/def ::cfn (s/keys :req [:cfn/resources
                           :aws/template-format-version]) )

(defprotocol Prepare
  (to-cfn [this root]))

(defrecord Ref [name]
  Prepare
  (to-cfn [this root]
    {"Ref" name}))

(def ^:private special-key-name
  {:aws/template-format-version "AWSTemplateFormatVersion"})

(defn- cfn-key [kw]
  (or (special-key-name kw)
      (reduce str (map str/capitalize
                       (str/split (name kw) #"-")))))

(defn- process-resource [resource]
  {:cfn/type (:cfn/type resource)
   :properties (dissoc resource :cfn/type)})

(defn- process-resources [edn]
  (update edn :cfn/resources
          (fn [resources]
            (reduce-kv
             (fn [m k v]
               (assoc m k (process-resource v)))
             {} resources))))

(defn edn->cfn
  "Given Clojure (EDN) data, returns a CloudFormation JSON
  document describing the resources.

  If the input data is not valid, an exception is thrown with the spec errors and
  the expound error message."
  [edn]
  (if-not (s/valid? ::cfn edn)
    (throw (ex-info (expound/expound-str ::cfn edn)
                    {:explain-data (s/explain-data ::cfn edn)}))
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
     {:pretty true})))

(comment
  (def paths [["/service" "service-tg"]
              ["/api/*" "api-tg"]
              ["/static/*" "resources-tg"]])

  (println
   (edn->cfn
    {:aws/template-format-version "2010-09-09"
     :cfn/resources
     (merge
      {"my-ec2-machine" {:cfn/type "AWS::EC2::Instance"
                         :ec2/disable-api-termination false
                         :ec2/instance-initiated-shutdown-behaviour "stop"
                         :ec2/image-id #ref "image-id"}}
      (into
       {}
       (map-indexed
        (fn [i [path target-group paths]]
          [(str "rule" i)
           {:cfn/type "AWS::ElasticLoadBalancingV2::ListenerRule"
            :elbv2/actions
            {:elbv2/type "forward"
             :elbv2/target-group-arn (->Ref target-group)}

            :elbv2/conditions
            {:elbv2/field "path-pattern"
             :elbv2/values [path]}
            :elbv2/listener-arn (->Ref "appelb")
            :elbv2/priority (inc i)}]) paths)))
     :parameters {"image-id" "some-ami-id"}})))
