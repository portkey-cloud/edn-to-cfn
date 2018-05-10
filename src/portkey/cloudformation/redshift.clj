(ns portkey.cloudformation.redshift
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.redshift/cluster-security-group-ingress
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.redshift/cluster-security-group-name]
   :opt
   [:portkey.cloudformation.redshift/cidrip
    :portkey.cloudformation.redshift/ec2-security-group-name
    :portkey.cloudformation.redshift/ec2-security-group-owner-id]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/cidrip
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/cluster-security-group-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/ec2-security-group-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/ec2-security-group-owner-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.redshift/cluster-subnet-group
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.redshift/description
    :portkey.cloudformation.redshift/subnet-ids]
   :opt
   [:portkey.cloudformation.redshift/tags]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/description
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.redshift/cluster-security-group
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.redshift/description]
   :opt
   [:portkey.cloudformation.redshift/tags]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/description
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.redshift/cluster
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.redshift/db-name
    :portkey.cloudformation.redshift/cluster-type
    :portkey.cloudformation.redshift/master-user-password
    :portkey.cloudformation.redshift/master-username
    :portkey.cloudformation.redshift/node-type]
   :opt
   [:portkey.cloudformation.redshift/snapshot-identifier
    :portkey.cloudformation.redshift/publicly-accessible
    :portkey.cloudformation.redshift/logging-properties
    :portkey.cloudformation.redshift/preferred-maintenance-window
    :portkey.cloudformation.redshift/encrypted
    :portkey.cloudformation.redshift/owner-account
    :portkey.cloudformation.redshift/hsm-client-certificate-identifier
    :portkey.cloudformation.redshift/cluster-identifier
    :portkey.cloudformation.redshift/cluster-subnet-group-name
    :portkey.cloudformation.redshift/number-of-nodes
    :portkey.cloudformation.redshift/tags
    :portkey.cloudformation.redshift/vpc-security-group-ids
    :portkey.cloudformation.redshift/availability-zone
    :portkey.cloudformation.redshift/cluster-security-groups
    :portkey.cloudformation.redshift/elastic-ip
    :portkey.cloudformation.redshift/hsm-configuration-identifier
    :portkey.cloudformation.redshift/port
    :portkey.cloudformation.redshift/kms-key-id
    :portkey.cloudformation.redshift/allow-version-upgrade
    :portkey.cloudformation.redshift/cluster-version
    :portkey.cloudformation.redshift/automated-snapshot-retention-period
    :portkey.cloudformation.redshift/iam-roles
    :portkey.cloudformation.redshift/snapshot-cluster-identifier
    :portkey.cloudformation.redshift/cluster-parameter-group-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/snapshot-identifier
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/publicly-accessible
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/preferred-maintenance-window
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/owner-account
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/hsm-client-certificate-identifier
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/cluster-identifier
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/cluster-subnet-group-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/number-of-nodes
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/db-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/availability-zone
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/cluster-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/master-user-password
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/elastic-ip
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/master-username
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/hsm-configuration-identifier
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/kms-key-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/allow-version-upgrade
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/cluster-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/automated-snapshot-retention-period
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/node-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/snapshot-cluster-identifier
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/cluster-parameter-group-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.redshift/cluster-parameter-group
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.redshift/description
    :portkey.cloudformation.redshift/parameter-group-family]
   :opt
   [:portkey.cloudformation.redshift/parameters
    :portkey.cloudformation.redshift/tags]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/parameter-group-family
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/bucket-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/s3-key-prefix
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/logging-properties
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.redshift/bucket-name]
   :opt
   [:portkey.cloudformation.redshift/s3-key-prefix])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/parameter-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/parameter-value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.redshift/parameter
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.redshift/parameter-name
    :portkey.cloudformation.redshift/parameter-value]
   :opt
   [])))
