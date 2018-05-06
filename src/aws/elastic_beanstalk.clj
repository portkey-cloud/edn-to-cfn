(ns aws.elastic-beanstalk
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.elastic-beanstalk/application
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.elastic-beanstalk/application-name
   :aws.elastic-beanstalk/description
   :aws.elastic-beanstalk/resource-lifecycle-config]))
(clojure.spec.alpha/def
 :aws.elastic-beanstalk/configuration-template
 (clojure.spec.alpha/keys
  :req
  [:aws.elastic-beanstalk/application-name]
  :opt
  [:aws.elastic-beanstalk/description
   :aws.elastic-beanstalk/environment-id
   :aws.elastic-beanstalk/option-settings
   :aws.elastic-beanstalk/platform-arn
   :aws.elastic-beanstalk/solution-stack-name
   :aws.elastic-beanstalk/source-configuration]))
(clojure.spec.alpha/def
 :aws.elastic-beanstalk/environment
 (clojure.spec.alpha/keys
  :req
  [:aws.elastic-beanstalk/application-name]
  :opt
  [:aws.elastic-beanstalk/version-label
   :aws.elastic-beanstalk/tier
   :aws.elastic-beanstalk/solution-stack-name
   :aws.elastic-beanstalk/environment-name
   :aws.elastic-beanstalk/option-settings
   :aws.elastic-beanstalk/tags
   :aws.elastic-beanstalk/description
   :aws.elastic-beanstalk/cname-prefix
   :aws.elastic-beanstalk/template-name
   :aws.elastic-beanstalk/platform-arn]))
(clojure.spec.alpha/def
 :aws.elastic-beanstalk/application-version
 (clojure.spec.alpha/keys
  :req
  [:aws.elastic-beanstalk/application-name
   :aws.elastic-beanstalk/source-bundle]
  :opt
  [:aws.elastic-beanstalk/description]))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/namespace
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/option-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/resource-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/configuration-option-setting
  (clojure.spec.alpha/keys
   :req
   [:aws.elastic-beanstalk/namespace
    :aws.elastic-beanstalk/option-name]
   :opt
   [:aws.elastic-beanstalk/resource-name
    :aws.elastic-beanstalk/value])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/service-role
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/application-resource-lifecycle-config
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.elastic-beanstalk/service-role
    :aws.elastic-beanstalk/version-lifecycle-config])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/delete-source-from-s3
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/max-age-in-days
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/max-age-rule
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.elastic-beanstalk/delete-source-from-s3
    :aws.elastic-beanstalk/enabled
    :aws.elastic-beanstalk/max-age-in-days])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/delete-source-from-s3
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/max-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/max-count-rule
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.elastic-beanstalk/delete-source-from-s3
    :aws.elastic-beanstalk/enabled
    :aws.elastic-beanstalk/max-count])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/namespace
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/option-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/resource-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/option-setting
  (clojure.spec.alpha/keys
   :req
   [:aws.elastic-beanstalk/namespace
    :aws.elastic-beanstalk/option-name]
   :opt
   [:aws.elastic-beanstalk/resource-name
    :aws.elastic-beanstalk/value])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/application-version-lifecycle-config
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.elastic-beanstalk/max-age-rule
    :aws.elastic-beanstalk/max-count-rule])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/tier
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.elastic-beanstalk/name
    :aws.elastic-beanstalk/type
    :aws.elastic-beanstalk/version])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/application-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/template-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/source-configuration
  (clojure.spec.alpha/keys
   :req
   [:aws.elastic-beanstalk/application-name
    :aws.elastic-beanstalk/template-name]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/s3-bucket
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/s3-key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.elastic-beanstalk/source-bundle
  (clojure.spec.alpha/keys
   :req
   [:aws.elastic-beanstalk/s3-bucket :aws.elastic-beanstalk/s3-key]
   :opt
   [])))
