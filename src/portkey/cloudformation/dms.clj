(ns portkey.cloudformation.dms
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.dms/replication-subnet-group
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.dms/replication-subnet-group-description
    :portkey.cloudformation.dms/subnet-ids]
   :opt
   [:portkey.cloudformation.dms/replication-subnet-group-identifier
    :portkey.cloudformation.dms/tags]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-subnet-group-description
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-subnet-group-identifier
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.dms/replication-instance
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.dms/replication-instance-class]
   :opt
   [:portkey.cloudformation.dms/publicly-accessible
    :portkey.cloudformation.dms/preferred-maintenance-window
    :portkey.cloudformation.dms/auto-minor-version-upgrade
    :portkey.cloudformation.dms/tags
    :portkey.cloudformation.dms/vpc-security-group-ids
    :portkey.cloudformation.dms/availability-zone
    :portkey.cloudformation.dms/replication-instance-identifier
    :portkey.cloudformation.dms/allow-major-version-upgrade
    :portkey.cloudformation.dms/allocated-storage
    :portkey.cloudformation.dms/replication-subnet-group-identifier
    :portkey.cloudformation.dms/engine-version
    :portkey.cloudformation.dms/kms-key-id
    :portkey.cloudformation.dms/multi-az]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-instance-class
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/publicly-accessible
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/preferred-maintenance-window
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/auto-minor-version-upgrade
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/availability-zone
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-instance-identifier
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/allow-major-version-upgrade
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/allocated-storage
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-subnet-group-identifier
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/engine-version
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/kms-key-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/multi-az
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.dms/certificate
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id :portkey.cloudformation/type]
   :opt
   [:portkey.cloudformation.dms/certificate-identifier
    :portkey.cloudformation.dms/certificate-pem
    :portkey.cloudformation.dms/certificate-wallet]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/certificate-identifier
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/certificate-pem
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/certificate-wallet
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.dms/endpoint
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.dms/engine-name
    :portkey.cloudformation.dms/endpoint-type]
   :opt
   [:portkey.cloudformation.dms/username
    :portkey.cloudformation.dms/s3-settings
    :portkey.cloudformation.dms/password
    :portkey.cloudformation.dms/database-name
    :portkey.cloudformation.dms/extra-connection-attributes
    :portkey.cloudformation.dms/endpoint-identifier
    :portkey.cloudformation.dms/tags
    :portkey.cloudformation.dms/mongo-db-settings
    :portkey.cloudformation.dms/port
    :portkey.cloudformation.dms/kms-key-id
    :portkey.cloudformation.dms/ssl-mode
    :portkey.cloudformation.dms/dynamo-db-settings
    :portkey.cloudformation.dms/certificate-arn
    :portkey.cloudformation.dms/server-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/username
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/engine-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/password
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/database-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/extra-connection-attributes
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/endpoint-identifier
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/endpoint-type
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/port
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/kms-key-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/ssl-mode
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/certificate-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/server-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.dms/replication-task
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.dms/source-endpoint-arn
    :portkey.cloudformation.dms/migration-type
    :portkey.cloudformation.dms/replication-instance-arn
    :portkey.cloudformation.dms/target-endpoint-arn
    :portkey.cloudformation.dms/table-mappings]
   :opt
   [:portkey.cloudformation.dms/cdc-start-time
    :portkey.cloudformation.dms/replication-task-settings
    :portkey.cloudformation.dms/tags
    :portkey.cloudformation.dms/replication-task-identifier]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/cdc-start-time
  (portkey.cloudformation/ref-or-spec clojure.core/double?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-task-settings
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/source-endpoint-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/migration-type
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-instance-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/target-endpoint-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/replication-task-identifier
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/table-mappings
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.dms/event-subscription
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.dms/sns-topic-arn]
   :opt
   [:portkey.cloudformation.dms/source-type
    :portkey.cloudformation.dms/event-categories
    :portkey.cloudformation.dms/enabled
    :portkey.cloudformation.dms/subscription-name
    :portkey.cloudformation.dms/source-ids
    :portkey.cloudformation.dms/tags]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/source-type
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/enabled
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/subscription-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/sns-topic-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/service-access-role-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/dynamo-db-settings
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.dms/service-access-role-arn])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/username
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/password
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/database-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/extract-doc-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/auth-mechanism
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/port
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/auth-type
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/auth-source
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/server-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/docs-to-investigate
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/nesting-level
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/mongo-db-settings
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.dms/username
    :portkey.cloudformation.dms/password
    :portkey.cloudformation.dms/database-name
    :portkey.cloudformation.dms/extract-doc-id
    :portkey.cloudformation.dms/auth-mechanism
    :portkey.cloudformation.dms/port
    :portkey.cloudformation.dms/auth-type
    :portkey.cloudformation.dms/auth-source
    :portkey.cloudformation.dms/server-name
    :portkey.cloudformation.dms/docs-to-investigate
    :portkey.cloudformation.dms/nesting-level])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/external-table-definition
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/bucket-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/bucket-folder
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/csv-row-delimiter
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/csv-delimiter
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/service-access-role-arn
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/compression-type
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.dms/s3-settings
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.dms/external-table-definition
    :portkey.cloudformation.dms/bucket-name
    :portkey.cloudformation.dms/bucket-folder
    :portkey.cloudformation.dms/csv-row-delimiter
    :portkey.cloudformation.dms/csv-delimiter
    :portkey.cloudformation.dms/service-access-role-arn
    :portkey.cloudformation.dms/compression-type])))
