(ns portkey.cloudformation.elastic-load-balancing
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.elastic-load-balancing/load-balancer
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.elastic-load-balancing/listeners]
   :opt
   [:portkey.cloudformation.elastic-load-balancing/health-check
    :portkey.cloudformation.elastic-load-balancing/app-cookie-stickiness-policy
    :portkey.cloudformation.elastic-load-balancing/subnets
    :portkey.cloudformation.elastic-load-balancing/cross-zone
    :portkey.cloudformation.elastic-load-balancing/access-logging-policy
    :portkey.cloudformation.elastic-load-balancing/security-groups
    :portkey.cloudformation.elastic-load-balancing/load-balancer-name
    :portkey.cloudformation.elastic-load-balancing/lb-cookie-stickiness-policy
    :portkey.cloudformation.elastic-load-balancing/tags
    :portkey.cloudformation.elastic-load-balancing/connection-draining-policy
    :portkey.cloudformation.elastic-load-balancing/scheme
    :portkey.cloudformation.elastic-load-balancing/policies
    :portkey.cloudformation.elastic-load-balancing/availability-zones
    :portkey.cloudformation.elastic-load-balancing/connection-settings
    :portkey.cloudformation.elastic-load-balancing/instances]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/cross-zone
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/load-balancer-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/scheme
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/emit-interval
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/enabled
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/s3-bucket-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/s3-bucket-prefix
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/access-logging-policy
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.elastic-load-balancing/enabled
    :portkey.cloudformation.elastic-load-balancing/s3-bucket-name]
   :opt
   [:portkey.cloudformation.elastic-load-balancing/emit-interval
    :portkey.cloudformation.elastic-load-balancing/s3-bucket-prefix])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/instance-port
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/instance-protocol
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/load-balancer-port
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/protocol
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/ssl-certificate-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/listeners
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.elastic-load-balancing/instance-port
    :portkey.cloudformation.elastic-load-balancing/load-balancer-port
    :portkey.cloudformation.elastic-load-balancing/protocol]
   :opt
   [:portkey.cloudformation.elastic-load-balancing/instance-protocol
    :portkey.cloudformation.elastic-load-balancing/policy-names
    :portkey.cloudformation.elastic-load-balancing/ssl-certificate-id])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/policy-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/policy-type
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/policies
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.elastic-load-balancing/attributes
    :portkey.cloudformation.elastic-load-balancing/policy-name
    :portkey.cloudformation.elastic-load-balancing/policy-type]
   :opt
   [:portkey.cloudformation.elastic-load-balancing/instance-ports
    :portkey.cloudformation.elastic-load-balancing/load-balancer-ports])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/idle-timeout
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/connection-settings
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.elastic-load-balancing/idle-timeout]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/enabled
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/timeout
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/connection-draining-policy
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.elastic-load-balancing/enabled]
   :opt
   [:portkey.cloudformation.elastic-load-balancing/timeout])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/cookie-expiration-period
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/policy-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/lb-cookie-stickiness-policy
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.elastic-load-balancing/cookie-expiration-period
    :portkey.cloudformation.elastic-load-balancing/policy-name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/cookie-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/policy-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/app-cookie-stickiness-policy
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.elastic-load-balancing/cookie-name
    :portkey.cloudformation.elastic-load-balancing/policy-name]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/healthy-threshold
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/interval
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/target
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/timeout
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/unhealthy-threshold
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.elastic-load-balancing/health-check
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.elastic-load-balancing/healthy-threshold
    :portkey.cloudformation.elastic-load-balancing/interval
    :portkey.cloudformation.elastic-load-balancing/target
    :portkey.cloudformation.elastic-load-balancing/timeout
    :portkey.cloudformation.elastic-load-balancing/unhealthy-threshold]
   :opt
   [])))
