(ns aws.work-spaces
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.work-spaces/workspace
 (clojure.spec.alpha/keys
  :req
  [:aws.work-spaces/bundle-id
   :aws.work-spaces/directory-id
   :aws.work-spaces/user-name]
  :opt
  [:aws.work-spaces/root-volume-encryption-enabled
   :aws.work-spaces/user-volume-encryption-enabled
   :aws.work-spaces/volume-encryption-key]))
