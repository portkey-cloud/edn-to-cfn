(ns portkey.cloudformation.efs
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.efs/mount-target
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.efs/file-system-id
    :portkey.cloudformation.efs/security-groups
    :portkey.cloudformation.efs/subnet-id]
   :opt
   [:portkey.cloudformation.efs/ip-address]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/file-system-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/subnet-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.efs/file-system
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.efs/encrypted
    :portkey.cloudformation.efs/file-system-tags
    :portkey.cloudformation.efs/kms-key-id
    :portkey.cloudformation.efs/performance-mode]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/kms-key-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/performance-mode
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.efs/elastic-file-system-tag
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.efs/key :portkey.cloudformation.efs/value]
   :opt
   [])))
