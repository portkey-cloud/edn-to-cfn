(ns portkey.cloudformation.ecr
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ecr/repository
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecr/lifecycle-policy
    :portkey.cloudformation.ecr/repository-name
    :portkey.cloudformation.ecr/repository-policy-text]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecr/repository-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecr/repository-policy-text
  clojure.core/any?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecr/lifecycle-policy-text
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecr/registry-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecr/lifecycle-policy
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecr/lifecycle-policy-text
    :portkey.cloudformation.ecr/registry-id])))
