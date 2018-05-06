(ns edn-to-cfn.specs.aws
  (:require [clojure.spec.alpha :as s]))


(s/def :aws/template-format-version string?)
