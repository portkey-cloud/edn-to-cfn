(ns portkey.cloudformation.step-functions
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.step-functions/activity
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.step-functions/name]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.step-functions/name
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.step-functions/state-machine
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.step-functions/definition-string
    :portkey.cloudformation.step-functions/role-arn]
   :opt
   [:portkey.cloudformation.step-functions/state-machine-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.step-functions/definition-string
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.step-functions/state-machine-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.step-functions/role-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
