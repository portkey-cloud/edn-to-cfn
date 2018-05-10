(ns portkey.edn-to-cfn.tools.generate
  "Generate clojure.spec from AWS CloudFormation specification"
  (:require [cheshire.core :as cheshire]
            [clojure.java.io :as io]
            [clojure.spec.alpha :as s]
            [clojure.string :as str]
            [clojure.pprint :as pprint])
  (:import (org.jsoup Jsoup)))

(defn- camel->clojure [string]
  (-> string
      ;; borrowed from r0man/inflections
      ;; -------------------------------
      ;; consoleAPICalled -> console-api-called
      (str/replace #"([A-Z]+)([A-Z][a-z])" "$1-$2")
      ;; console1APICalled -> console1-api-called
      (str/replace #"([a-z\d])([A-Z])" "$1-$2")
      ;; console api called -> console-api-called
      (str/replace #"\s+" "-")
      ;; ;; console_api_called -> console-api-called
      (str/replace #"_" "-")
      ;; Lower case everything
      (str/lower-case)))

(defn read-spec [url]
  (with-open [in (java.util.zip.GZIPInputStream. (io/input-stream url))]
    (slurp in)))

(def json-spec
  (-> "https://d1mta8qj7i28i2.cloudfront.net/latest/gzip/CloudFormationResourceSpecification.json"
      read-spec
      cheshire/decode))

(defn- resource-documentation [{:strs [Documentation] :as resource-type}]
  (-> Documentation
      Jsoup/connect .get
      (.select "h1.topictitle + p") .first .text))

(defn type->namespace [type-name]
  (let [[_ service] (re-matches #"AWS::([^:]+)::.*" type-name)]
    (when service (str "portkey.cloudformation." (camel->clojure service)))))

(defn resource-type-name [resource-type-name]
  (let [[_ name] (re-matches #"AWS::[^:]+::(.*)$" resource-type-name)]
    (camel->clojure name)))

(defn property-name [property-type-name]
  (some->> property-type-name
           (re-matches #"AWS::[^:]+::[^.]+\.(.*)$")
           second camel->clojure))

(defn primitive-type [type-name]
  (case type-name
    "String" `string?
    "Boolean" `boolean?
    "Integer" `integer?
    "Long" `integer?
    "Double" `double?
    "Timestamp" `inst?
    "Json" `any?))

(defn resource-spec [name {:strs [Properties]}]
  (let [namespace (type->namespace name)
        type-name (resource-type-name name)
        {required-props true
         optional-props false} (group-by (comp #(get % "Required") second) (seq Properties))]
    `(do
       ;; Output multi-spec method for this resource type
       (defmethod portkey.cloudformation/resource-type-spec ~(keyword namespace type-name) [_#]
         (s/keys :req [:portkey.cloudformation/id
                       :portkey.cloudformation/type
                       ~@(for [[p _] required-props]
                           (keyword namespace (camel->clojure p)))]
                 :opt [~@(for [[p _] optional-props]
                           (keyword namespace (camel->clojure p)))]))
       ;; Output specs for all primitive properties (that don't have their own definitions)
       ~@(for [[name {:strs [PrimitiveType]}] (seq Properties)
               :when PrimitiveType]
           `(s/def ~(keyword namespace (camel->clojure name))
              (portkey.cloudformation/ref-or-spec ~(primitive-type PrimitiveType)))))))



(defn property-spec [name {:strs [Properties]}]
  (let [namespace (type->namespace name)
        property-name (property-name name)
        {required-props true
         optional-props false} (group-by (comp #(get % "Required") second) (seq Properties))]
    `(do
       ~@(for [[p {:strs [PrimitiveType]}] Properties
               :when PrimitiveType]
           `(s/def ~(keyword namespace (camel->clojure p))
              (portkey.cloudformation/ref-or-spec
               ~(primitive-type PrimitiveType))))
       (s/def ~(keyword namespace property-name)
         (s/keys :req [~@(for [[p _] required-props]
                           (keyword namespace (camel->clojure p)))]
                 :opt [~@(for [[p _] optional-props]
                           (keyword namespace (camel->clojure p)))])))))

(defn generate-files [json-spec]
  (let [resources-by-namespace (group-by (comp type->namespace first)
                                         (seq (get json-spec "ResourceTypes")))
        properties-by-namespace (group-by (comp type->namespace first)
                                          (seq (get json-spec "PropertyTypes")))
        namespaces (into #{} (concat
                              (keys resources-by-namespace)
                              (keys properties-by-namespace)))]
    (doseq [namespace namespaces
            :when namespace
            :let [file (io/file (str "src/"
                                     (-> namespace
                                         (str/replace #"\." "/")
                                         (str/replace #"-" "_")
                                         (str/replace #"^aws/" "portkey/cloudformation/"))
                                     ".clj"))]]
      (println "Generating namespace: " namespace " to " file)
      (with-open [out (io/writer file)]
        (.write out
                (str "(ns " namespace "\n"
                     "  \"AUTOGENERATED clojure.spec definitions\"\n"
                     "  (:require [clojure.spec.alpha]\n"
                     "            [portkey.cloudformation]))\n\n"))
        (doseq [[name resource] (resources-by-namespace namespace)]
          (println "   --> RESOURCE: " name)
          (pprint/pprint (resource-spec name resource) out))
        (doseq [[name property] (properties-by-namespace namespace)]
          (println "   --> PROPERTY: " name)
          (pprint/pprint (property-spec name property) out))))))

(defn generate []
  (generate-files json-spec))
