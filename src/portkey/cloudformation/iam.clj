(ns portkey.cloudformation.iam
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/user
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.iam/groups
    :portkey.cloudformation.iam/login-profile
    :portkey.cloudformation.iam/managed-policy-arns
    :portkey.cloudformation.iam/path
    :portkey.cloudformation.iam/policies
    :portkey.cloudformation.iam/user-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/user-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/group
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.iam/group-name
    :portkey.cloudformation.iam/managed-policy-arns
    :portkey.cloudformation.iam/path
    :portkey.cloudformation.iam/policies]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/group-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/path
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/instance-profile
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/roles]
   :opt
   [:portkey.cloudformation.iam/instance-profile-name
    :portkey.cloudformation.iam/path]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/instance-profile-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/path
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/policy
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/policy-document
    :portkey.cloudformation.iam/policy-name]
   :opt
   [:portkey.cloudformation.iam/groups
    :portkey.cloudformation.iam/roles
    :portkey.cloudformation.iam/users]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-document
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/managed-policy
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/policy-document]
   :opt
   [:portkey.cloudformation.iam/description
    :portkey.cloudformation.iam/groups
    :portkey.cloudformation.iam/managed-policy-name
    :portkey.cloudformation.iam/path
    :portkey.cloudformation.iam/roles
    :portkey.cloudformation.iam/users]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/managed-policy-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-document
  clojure.core/any?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/role
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/assume-role-policy-document]
   :opt
   [:portkey.cloudformation.iam/managed-policy-arns
    :portkey.cloudformation.iam/path
    :portkey.cloudformation.iam/policies
    :portkey.cloudformation.iam/role-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/assume-role-policy-document
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/role-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/access-key
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/user-name]
   :opt
   [:portkey.cloudformation.iam/serial
    :portkey.cloudformation.iam/status]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/serial
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/status
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/user-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.iam/user-to-group-addition
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/group-name
    :portkey.cloudformation.iam/users]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/group-name
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-document
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/policy-document
    :portkey.cloudformation.iam/policy-name]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/password
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/password-reset-required
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/login-profile
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/password]
   :opt
   [:portkey.cloudformation.iam/password-reset-required])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-document
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/policy-document
    :portkey.cloudformation.iam/policy-name]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-document
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.iam/policy
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.iam/policy-document
    :portkey.cloudformation.iam/policy-name]
   :opt
   [])))
