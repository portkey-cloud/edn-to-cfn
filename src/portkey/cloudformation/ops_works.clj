(ns portkey.cloudformation.ops-works
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ops-works/app
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/type
    :portkey.cloudformation.ops-works/stack-id
    :portkey.cloudformation.ops-works/name]
   :opt
   [:portkey.cloudformation.ops-works/shortname
    :portkey.cloudformation.ops-works/enable-ssl
    :portkey.cloudformation.ops-works/domains
    :portkey.cloudformation.ops-works/app-source
    :portkey.cloudformation.ops-works/attributes
    :portkey.cloudformation.ops-works/data-sources
    :portkey.cloudformation.ops-works/description
    :portkey.cloudformation.ops-works/ssl-configuration
    :portkey.cloudformation.ops-works/environment]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/shortname
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/enable-ssl
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/stack-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ops-works/volume
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/ec2-volume-id
    :portkey.cloudformation.ops-works/stack-id]
   :opt
   [:portkey.cloudformation.ops-works/mount-point
    :portkey.cloudformation.ops-works/name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ec2-volume-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/mount-point
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/stack-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ops-works/stack
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/service-role-arn
    :portkey.cloudformation.ops-works/default-instance-profile-arn
    :portkey.cloudformation.ops-works/name]
   :opt
   [:portkey.cloudformation.ops-works/custom-cookbooks-source
    :portkey.cloudformation.ops-works/hostname-theme
    :portkey.cloudformation.ops-works/default-ssh-key-name
    :portkey.cloudformation.ops-works/default-availability-zone
    :portkey.cloudformation.ops-works/chef-configuration
    :portkey.cloudformation.ops-works/configuration-manager
    :portkey.cloudformation.ops-works/tags
    :portkey.cloudformation.ops-works/agent-version
    :portkey.cloudformation.ops-works/use-opsworks-security-groups
    :portkey.cloudformation.ops-works/rds-db-instances
    :portkey.cloudformation.ops-works/attributes
    :portkey.cloudformation.ops-works/source-stack-id
    :portkey.cloudformation.ops-works/default-root-device-type
    :portkey.cloudformation.ops-works/elastic-ips
    :portkey.cloudformation.ops-works/vpc-id
    :portkey.cloudformation.ops-works/use-custom-cookbooks
    :portkey.cloudformation.ops-works/custom-json
    :portkey.cloudformation.ops-works/ecs-cluster-arn
    :portkey.cloudformation.ops-works/default-subnet-id
    :portkey.cloudformation.ops-works/clone-app-ids
    :portkey.cloudformation.ops-works/default-os
    :portkey.cloudformation.ops-works/clone-permissions]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/service-role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/hostname-theme
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/default-ssh-key-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/default-availability-zone
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/agent-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/use-opsworks-security-groups
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/source-stack-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/default-root-device-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/vpc-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/use-custom-cookbooks
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/default-instance-profile-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/custom-json
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ecs-cluster-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/default-subnet-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/default-os
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/clone-permissions
  clojure.core/boolean?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ops-works/layer
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/shortname
    :portkey.cloudformation.ops-works/type
    :portkey.cloudformation.ops-works/enable-auto-healing
    :portkey.cloudformation.ops-works/auto-assign-public-ips
    :portkey.cloudformation.ops-works/stack-id
    :portkey.cloudformation.ops-works/auto-assign-elastic-ips
    :portkey.cloudformation.ops-works/name]
   :opt
   [:portkey.cloudformation.ops-works/custom-recipes
    :portkey.cloudformation.ops-works/custom-security-group-ids
    :portkey.cloudformation.ops-works/use-ebs-optimized-instances
    :portkey.cloudformation.ops-works/tags
    :portkey.cloudformation.ops-works/lifecycle-event-configuration
    :portkey.cloudformation.ops-works/attributes
    :portkey.cloudformation.ops-works/packages
    :portkey.cloudformation.ops-works/load-based-auto-scaling
    :portkey.cloudformation.ops-works/custom-json
    :portkey.cloudformation.ops-works/install-updates-on-boot
    :portkey.cloudformation.ops-works/volume-configurations
    :portkey.cloudformation.ops-works/custom-instance-profile-arn]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/shortname
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/enable-auto-healing
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/use-ebs-optimized-instances
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/auto-assign-public-ips
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/stack-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/auto-assign-elastic-ips
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/custom-json
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/install-updates-on-boot
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/custom-instance-profile-arn
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ops-works/elastic-load-balancer-attachment
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/elastic-load-balancer-name
    :portkey.cloudformation.ops-works/layer-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/elastic-load-balancer-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/layer-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ops-works/instance
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/instance-type
    :portkey.cloudformation.ops-works/layer-ids
    :portkey.cloudformation.ops-works/stack-id]
   :opt
   [:portkey.cloudformation.ops-works/time-based-auto-scaling
    :portkey.cloudformation.ops-works/subnet-id
    :portkey.cloudformation.ops-works/tenancy
    :portkey.cloudformation.ops-works/root-device-type
    :portkey.cloudformation.ops-works/ebs-optimized
    :portkey.cloudformation.ops-works/agent-version
    :portkey.cloudformation.ops-works/os
    :portkey.cloudformation.ops-works/availability-zone
    :portkey.cloudformation.ops-works/hostname
    :portkey.cloudformation.ops-works/ami-id
    :portkey.cloudformation.ops-works/elastic-ips
    :portkey.cloudformation.ops-works/block-device-mappings
    :portkey.cloudformation.ops-works/architecture
    :portkey.cloudformation.ops-works/install-updates-on-boot
    :portkey.cloudformation.ops-works/virtualization-type
    :portkey.cloudformation.ops-works/auto-scaling-type
    :portkey.cloudformation.ops-works/ssh-key-name
    :portkey.cloudformation.ops-works/volumes]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/subnet-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/tenancy
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/root-device-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ebs-optimized
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/instance-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/agent-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/os
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/availability-zone
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/hostname
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ami-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/stack-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/architecture
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/install-updates-on-boot
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/virtualization-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/auto-scaling-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ssh-key-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.ops-works/user-profile
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/iam-user-arn]
   :opt
   [:portkey.cloudformation.ops-works/allow-self-management
    :portkey.cloudformation.ops-works/ssh-public-key
    :portkey.cloudformation.ops-works/ssh-username]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/allow-self-management
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/iam-user-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ssh-public-key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ssh-username
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/iops
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/snapshot-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/volume-size
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/volume-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ebs-block-device
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/delete-on-termination
    :portkey.cloudformation.ops-works/iops
    :portkey.cloudformation.ops-works/snapshot-id
    :portkey.cloudformation.ops-works/volume-size
    :portkey.cloudformation.ops-works/volume-type])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/password
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/revision
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ssh-key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/url
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/username
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/source
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/password
    :portkey.cloudformation.ops-works/revision
    :portkey.cloudformation.ops-works/ssh-key
    :portkey.cloudformation.ops-works/type
    :portkey.cloudformation.ops-works/url
    :portkey.cloudformation.ops-works/username])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/database-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/data-source
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/arn
    :portkey.cloudformation.ops-works/database-name
    :portkey.cloudformation.ops-works/type])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/time-based-auto-scaling
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/friday
    :portkey.cloudformation.ops-works/monday
    :portkey.cloudformation.ops-works/saturday
    :portkey.cloudformation.ops-works/sunday
    :portkey.cloudformation.ops-works/thursday
    :portkey.cloudformation.ops-works/tuesday
    :portkey.cloudformation.ops-works/wednesday])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/delay-until-elb-connections-drained
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/execution-timeout
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/shutdown-event-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/delay-until-elb-connections-drained
    :portkey.cloudformation.ops-works/execution-timeout])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/device-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/no-device
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/virtual-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/block-device-mapping
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/device-name
    :portkey.cloudformation.ops-works/ebs
    :portkey.cloudformation.ops-works/no-device
    :portkey.cloudformation.ops-works/virtual-name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/iops
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/mount-point
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/number-of-disks
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/raid-level
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/size
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/volume-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/volume-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/iops
    :portkey.cloudformation.ops-works/mount-point
    :portkey.cloudformation.ops-works/number-of-disks
    :portkey.cloudformation.ops-works/raid-level
    :portkey.cloudformation.ops-works/size
    :portkey.cloudformation.ops-works/volume-type])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/stack-configuration-manager
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/name
    :portkey.cloudformation.ops-works/version])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ip
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/elastic-ip
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/ip]
   :opt
   [:portkey.cloudformation.ops-works/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/lifecycle-event-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/shutdown-event-configuration])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/certificate
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/chain
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/private-key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ssl-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/certificate
    :portkey.cloudformation.ops-works/chain
    :portkey.cloudformation.ops-works/private-key])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/secure
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/environment-variable
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/key
    :portkey.cloudformation.ops-works/value]
   :opt
   [:portkey.cloudformation.ops-works/secure])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/enable
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/load-based-auto-scaling
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/down-scaling
    :portkey.cloudformation.ops-works/enable
    :portkey.cloudformation.ops-works/up-scaling])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/berkshelf-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/manage-berkshelf
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/chef-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/berkshelf-version
    :portkey.cloudformation.ops-works/manage-berkshelf])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/recipes
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/configure
    :portkey.cloudformation.ops-works/deploy
    :portkey.cloudformation.ops-works/setup
    :portkey.cloudformation.ops-works/shutdown
    :portkey.cloudformation.ops-works/undeploy])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/password
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/revision
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ssh-key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/url
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/username
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/source
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/password
    :portkey.cloudformation.ops-works/revision
    :portkey.cloudformation.ops-works/ssh-key
    :portkey.cloudformation.ops-works/type
    :portkey.cloudformation.ops-works/url
    :portkey.cloudformation.ops-works/username])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/db-password
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/db-user
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/rds-db-instance-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/rds-db-instance
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.ops-works/db-password
    :portkey.cloudformation.ops-works/db-user
    :portkey.cloudformation.ops-works/rds-db-instance-arn]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/cpu-threshold
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/ignore-metrics-time
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/instance-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/load-threshold
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/memory-threshold
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/thresholds-wait-time
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.ops-works/auto-scaling-thresholds
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.ops-works/cpu-threshold
    :portkey.cloudformation.ops-works/ignore-metrics-time
    :portkey.cloudformation.ops-works/instance-count
    :portkey.cloudformation.ops-works/load-threshold
    :portkey.cloudformation.ops-works/memory-threshold
    :portkey.cloudformation.ops-works/thresholds-wait-time])))
