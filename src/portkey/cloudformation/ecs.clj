(ns portkey.cloudformation.ecs
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ecs/service
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/task-definition]
   :opt
   [:portkey.cloudformation.ecs/placement-strategies
    :portkey.cloudformation.ecs/desired-count
    :portkey.cloudformation.ecs/deployment-configuration
    :portkey.cloudformation.ecs/role
    :portkey.cloudformation.ecs/load-balancers
    :portkey.cloudformation.ecs/cluster
    :portkey.cloudformation.ecs/network-configuration
    :portkey.cloudformation.ecs/platform-version
    :portkey.cloudformation.ecs/service-name
    :portkey.cloudformation.ecs/launch-type
    :portkey.cloudformation.ecs/placement-constraints
    :portkey.cloudformation.ecs/health-check-grace-period-seconds]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/desired-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/role
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/cluster
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/task-definition
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/platform-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/service-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/launch-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/health-check-grace-period-seconds
  clojure.core/integer?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ecs/cluster
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/cluster-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/cluster-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ecs/task-definition
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/cpu
    :portkey.cloudformation.ecs/task-role-arn
    :portkey.cloudformation.ecs/family
    :portkey.cloudformation.ecs/execution-role-arn
    :portkey.cloudformation.ecs/memory
    :portkey.cloudformation.ecs/requires-compatibilities
    :portkey.cloudformation.ecs/network-mode
    :portkey.cloudformation.ecs/placement-constraints
    :portkey.cloudformation.ecs/volumes
    :portkey.cloudformation.ecs/container-definitions]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/cpu
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/task-role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/family
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/execution-role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/memory
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/network-mode
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/hard-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/soft-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/ulimit
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/hard-limit
    :portkey.cloudformation.ecs/name
    :portkey.cloudformation.ecs/soft-limit]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/key-value-pair
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/name
    :portkey.cloudformation.ecs/value])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/maximum-percent
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/minimum-healthy-percent
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/deployment-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/maximum-percent
    :portkey.cloudformation.ecs/minimum-healthy-percent])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/network-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/awsvpc-configuration])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/hostname
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/host-entry
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/hostname
    :portkey.cloudformation.ecs/ip-address]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/container-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/host-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/device
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/host-path]
   :opt
   [:portkey.cloudformation.ecs/container-path
    :portkey.cloudformation.ecs/permissions])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/source-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/host-volume-properties
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/source-path])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/kernel-capabilities
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/add :portkey.cloudformation.ecs/drop])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/assign-public-ip
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/aws-vpc-configuration
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/subnets]
   :opt
   [:portkey.cloudformation.ecs/assign-public-ip
    :portkey.cloudformation.ecs/security-groups])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/expression
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/placement-constraint
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/type]
   :opt
   [:portkey.cloudformation.ecs/expression])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/container-port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/host-port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/protocol
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/port-mapping
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/container-port
    :portkey.cloudformation.ecs/host-port
    :portkey.cloudformation.ecs/protocol])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/cpu
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/user
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/privileged
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/hostname
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/disable-networking
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/memory
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/readonly-root-filesystem
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/image
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/essential
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/working-directory
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/memory-reservation
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/container-definition
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/docker-security-options
    :portkey.cloudformation.ecs/volumes-from
    :portkey.cloudformation.ecs/cpu
    :portkey.cloudformation.ecs/port-mappings
    :portkey.cloudformation.ecs/user
    :portkey.cloudformation.ecs/privileged
    :portkey.cloudformation.ecs/log-configuration
    :portkey.cloudformation.ecs/hostname
    :portkey.cloudformation.ecs/disable-networking
    :portkey.cloudformation.ecs/environment
    :portkey.cloudformation.ecs/command
    :portkey.cloudformation.ecs/entry-point
    :portkey.cloudformation.ecs/linux-parameters
    :portkey.cloudformation.ecs/memory
    :portkey.cloudformation.ecs/ulimits
    :portkey.cloudformation.ecs/readonly-root-filesystem
    :portkey.cloudformation.ecs/extra-hosts
    :portkey.cloudformation.ecs/image
    :portkey.cloudformation.ecs/name
    :portkey.cloudformation.ecs/docker-labels
    :portkey.cloudformation.ecs/essential
    :portkey.cloudformation.ecs/working-directory
    :portkey.cloudformation.ecs/mount-points
    :portkey.cloudformation.ecs/dns-servers
    :portkey.cloudformation.ecs/memory-reservation
    :portkey.cloudformation.ecs/links
    :portkey.cloudformation.ecs/dns-search-domains])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/container-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/container-port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/load-balancer-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/target-group-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/load-balancer
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/container-port]
   :opt
   [:portkey.cloudformation.ecs/container-name
    :portkey.cloudformation.ecs/load-balancer-name
    :portkey.cloudformation.ecs/target-group-arn])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/expression
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/task-definition-placement-constraint
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/type]
   :opt
   [:portkey.cloudformation.ecs/expression])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/field
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/placement-strategy
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/type]
   :opt
   [:portkey.cloudformation.ecs/field])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/read-only
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/source-container
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/volume-from
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/read-only
    :portkey.cloudformation.ecs/source-container])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/volume
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/host
    :portkey.cloudformation.ecs/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/log-driver
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/log-configuration
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ecs/log-driver]
   :opt
   [:portkey.cloudformation.ecs/options])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/container-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/read-only
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/source-volume
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/mount-point
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/container-path
    :portkey.cloudformation.ecs/read-only
    :portkey.cloudformation.ecs/source-volume])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/init-process-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ecs/linux-parameters
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ecs/capabilities
    :portkey.cloudformation.ecs/devices
    :portkey.cloudformation.ecs/init-process-enabled])))
