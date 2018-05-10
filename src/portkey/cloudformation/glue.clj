(ns portkey.cloudformation.glue
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/connection
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/connection-input
    :portkey.cloudformation.glue/catalog-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/catalog-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/classifier
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/grok-classifier])))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/table
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/table-input
    :portkey.cloudformation.glue/database-name
    :portkey.cloudformation.glue/catalog-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/database-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/catalog-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/crawler
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/database-name
    :portkey.cloudformation.glue/role
    :portkey.cloudformation.glue/targets]
   :opt
   [:portkey.cloudformation.glue/classifiers
    :portkey.cloudformation.glue/table-prefix
    :portkey.cloudformation.glue/schema-change-policy
    :portkey.cloudformation.glue/description
    :portkey.cloudformation.glue/schedule
    :portkey.cloudformation.glue/name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/database-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/role
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/table-prefix
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/database
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/database-input
    :portkey.cloudformation.glue/catalog-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/catalog-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/dev-endpoint
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/public-key
    :portkey.cloudformation.glue/role-arn]
   :opt
   [:portkey.cloudformation.glue/extra-jars-s3-path
    :portkey.cloudformation.glue/endpoint-name
    :portkey.cloudformation.glue/number-of-nodes
    :portkey.cloudformation.glue/subnet-id
    :portkey.cloudformation.glue/extra-python-libs-s3-path
    :portkey.cloudformation.glue/security-group-ids]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/extra-jars-s3-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/endpoint-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/public-key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/number-of-nodes
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/subnet-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/extra-python-libs-s3-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/role-arn
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/job
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/role
    :portkey.cloudformation.glue/command]
   :opt
   [:portkey.cloudformation.glue/allocated-capacity
    :portkey.cloudformation.glue/log-uri
    :portkey.cloudformation.glue/default-arguments
    :portkey.cloudformation.glue/connections
    :portkey.cloudformation.glue/description
    :portkey.cloudformation.glue/max-retries
    :portkey.cloudformation.glue/execution-property
    :portkey.cloudformation.glue/name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/allocated-capacity
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/log-uri
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/default-arguments
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/role
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/max-retries
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/trigger
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/type
    :portkey.cloudformation.glue/actions]
   :opt
   [:portkey.cloudformation.glue/description
    :portkey.cloudformation.glue/schedule
    :portkey.cloudformation.glue/name
    :portkey.cloudformation.glue/predicate]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/schedule
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.glue/partition
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/table-name
    :portkey.cloudformation.glue/database-name
    :portkey.cloudformation.glue/catalog-id
    :portkey.cloudformation.glue/partition-input]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/table-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/database-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/catalog-id
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/availability-zone
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/subnet-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/physical-connection-requirements
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/availability-zone
    :portkey.cloudformation.glue/security-group-id-list
    :portkey.cloudformation.glue/subnet-id])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/comment
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/column
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/name]
   :opt
   [:portkey.cloudformation.glue/comment
    :portkey.cloudformation.glue/type])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/parameters
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/serialization-library
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/serde-info
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/parameters
    :portkey.cloudformation.glue/serialization-library
    :portkey.cloudformation.glue/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/connection-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/jdbc-target
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/connection-name
    :portkey.cloudformation.glue/path
    :portkey.cloudformation.glue/exclusions])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/connections-list
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/connections])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/update-behavior
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/delete-behavior
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/schema-change-policy
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/update-behavior
    :portkey.cloudformation.glue/delete-behavior])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/logical
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/predicate
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/logical
    :portkey.cloudformation.glue/conditions])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/location-uri
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/parameters
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/database-input
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/location-uri
    :portkey.cloudformation.glue/description
    :portkey.cloudformation.glue/parameters
    :portkey.cloudformation.glue/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/custom-patterns
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/grok-pattern
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/classification
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/grok-classifier
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/grok-pattern
    :portkey.cloudformation.glue/classification]
   :opt
   [:portkey.cloudformation.glue/custom-patterns
    :portkey.cloudformation.glue/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/parameters
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/partition-input
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/values]
   :opt
   [:portkey.cloudformation.glue/parameters
    :portkey.cloudformation.glue/storage-descriptor])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/skewed-column-value-location-maps
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/skewed-info
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/skewed-column-names
    :portkey.cloudformation.glue/skewed-column-values
    :portkey.cloudformation.glue/skewed-column-value-location-maps])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/column
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/sort-order
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/order
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/column
    :portkey.cloudformation.glue/sort-order]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/script-location
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/job-command
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/script-location
    :portkey.cloudformation.glue/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/comment
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/column
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/name]
   :opt
   [:portkey.cloudformation.glue/comment
    :portkey.cloudformation.glue/type])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/skewed-column-value-location-maps
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/skewed-info
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/skewed-column-names
    :portkey.cloudformation.glue/skewed-column-values
    :portkey.cloudformation.glue/skewed-column-value-location-maps])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/view-expanded-text
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/parameters
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/owner
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/table-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/retention
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/view-original-text
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/table-input
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/view-expanded-text
    :portkey.cloudformation.glue/parameters
    :portkey.cloudformation.glue/storage-descriptor
    :portkey.cloudformation.glue/partition-keys
    :portkey.cloudformation.glue/description
    :portkey.cloudformation.glue/owner
    :portkey.cloudformation.glue/table-type
    :portkey.cloudformation.glue/retention
    :portkey.cloudformation.glue/name
    :portkey.cloudformation.glue/view-original-text])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/targets
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/s3-targets
    :portkey.cloudformation.glue/jdbc-targets])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/s3-target
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/path
    :portkey.cloudformation.glue/exclusions])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/job-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/arguments
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/action
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/job-name
    :portkey.cloudformation.glue/arguments])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/column
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/sort-order
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/order
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/column]
   :opt
   [:portkey.cloudformation.glue/sort-order])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/connection-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/connection-properties
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/connection-input
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.glue/connection-type
    :portkey.cloudformation.glue/connection-properties]
   :opt
   [:portkey.cloudformation.glue/description
    :portkey.cloudformation.glue/match-criteria
    :portkey.cloudformation.glue/physical-connection-requirements
    :portkey.cloudformation.glue/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/state
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/logical-operator
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/job-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/condition
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/state
    :portkey.cloudformation.glue/logical-operator
    :portkey.cloudformation.glue/job-name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/max-concurrent-runs
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/execution-property
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/max-concurrent-runs])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/parameters
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/serialization-library
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/serde-info
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/parameters
    :portkey.cloudformation.glue/serialization-library
    :portkey.cloudformation.glue/name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/schedule-expression
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/schedule
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/schedule-expression])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/number-of-buckets
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/parameters
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/location
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/compressed
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/output-format
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/stored-as-sub-directories
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/input-format
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/storage-descriptor
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/number-of-buckets
    :portkey.cloudformation.glue/parameters
    :portkey.cloudformation.glue/location
    :portkey.cloudformation.glue/compressed
    :portkey.cloudformation.glue/serde-info
    :portkey.cloudformation.glue/output-format
    :portkey.cloudformation.glue/skewed-info
    :portkey.cloudformation.glue/stored-as-sub-directories
    :portkey.cloudformation.glue/bucket-columns
    :portkey.cloudformation.glue/input-format
    :portkey.cloudformation.glue/columns
    :portkey.cloudformation.glue/sort-columns])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/number-of-buckets
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/parameters
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/location
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/compressed
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/output-format
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/stored-as-sub-directories
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/input-format
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.glue/storage-descriptor
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.glue/number-of-buckets
    :portkey.cloudformation.glue/parameters
    :portkey.cloudformation.glue/location
    :portkey.cloudformation.glue/compressed
    :portkey.cloudformation.glue/serde-info
    :portkey.cloudformation.glue/output-format
    :portkey.cloudformation.glue/skewed-info
    :portkey.cloudformation.glue/stored-as-sub-directories
    :portkey.cloudformation.glue/bucket-columns
    :portkey.cloudformation.glue/input-format
    :portkey.cloudformation.glue/columns
    :portkey.cloudformation.glue/sort-columns])))