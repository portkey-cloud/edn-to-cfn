(ns portkey.cloudformation.guard-duty
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.guard-duty/member
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.guard-duty/member-id
    :portkey.cloudformation.guard-duty/email
    :portkey.cloudformation.guard-duty/detector-id]
   :opt
   [:portkey.cloudformation.guard-duty/status
    :portkey.cloudformation.guard-duty/message
    :portkey.cloudformation.guard-duty/disable-email-notification]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/status
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/member-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/email
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/message
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/disable-email-notification
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/detector-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.guard-duty/threat-intel-set
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.guard-duty/format
    :portkey.cloudformation.guard-duty/activate
    :portkey.cloudformation.guard-duty/detector-id
    :portkey.cloudformation.guard-duty/location]
   :opt
   [:portkey.cloudformation.guard-duty/name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/format
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/activate
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/detector-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/location
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.guard-duty/filter
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.guard-duty/action
    :portkey.cloudformation.guard-duty/description
    :portkey.cloudformation.guard-duty/detector-id
    :portkey.cloudformation.guard-duty/finding-criteria
    :portkey.cloudformation.guard-duty/rank]
   :opt
   [:portkey.cloudformation.guard-duty/name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/action
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/description
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/detector-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/rank
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/name
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.guard-duty/master
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.guard-duty/detector-id
    :portkey.cloudformation.guard-duty/master-id
    :portkey.cloudformation.guard-duty/invitation-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/detector-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/master-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/invitation-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.guard-duty/detector
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.guard-duty/enable]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/enable
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.guard-duty/ip-set
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.guard-duty/format
    :portkey.cloudformation.guard-duty/activate
    :portkey.cloudformation.guard-duty/detector-id
    :portkey.cloudformation.guard-duty/location]
   :opt
   [:portkey.cloudformation.guard-duty/name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/format
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/activate
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/detector-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/location
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/lt
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/gte
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/lte
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/condition
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.guard-duty/lt
    :portkey.cloudformation.guard-duty/gte
    :portkey.cloudformation.guard-duty/neq
    :portkey.cloudformation.guard-duty/eq
    :portkey.cloudformation.guard-duty/lte])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/criterion
  (portkey.cloudformation/ref-or-spec clojure.core/any?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.guard-duty/finding-criteria
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.guard-duty/criterion
    :portkey.cloudformation.guard-duty/item-type])))
