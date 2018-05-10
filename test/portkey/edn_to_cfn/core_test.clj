(ns portkey.edn-to-cfn.core-test
  (:require [portkey.edn-to-cfn.core :refer [edn->cfn] :as sut]
            [clojure.test :refer [deftest testing is] :as t]
            [portkey.cloudformation :as cfn]
            [portkey.cloudformation.ec2 :as ec2]
            [portkey.cloudformation.elastic-load-balancing-v2 :as elbv2]
            [clojure.spec.alpha :as s]))

(def paths [["/service" "service-tg"]
            ["/api/*" "api-tg"]
            ["/static/*" "resources-tg"]])

(def simple-template-edn
  {::cfn/template-format-version "2010-09-09"
   ::cfn/resources
   [{::cfn/type ::ec2/instance
     ::cfn/id "MyEc2Machine"
     ::ec2/disable-api-termination false
     ::ec2/instance-initiated-shutdown-behaviour "stop"
     ::ec2/image-id (cfn/ref "image-id")}

    (map-indexed
     (fn [i [path target-group paths]]
       {::cfn/id (str "rule" i)
        ::cfn/type ::elbv2/listener-rule
        ::elbv2/actions
        {::elbv2/type "forward"
         ::elbv2/target-group-arn (cfn/ref target-group)}

        ::elbv2/conditions
        {::elbv2/field "path-pattern"
         ::elbv2/values [path]}
        ::elbv2/listener-arn (cfn/ref "appelb")
        ::elbv2/priority (inc i)}) paths)]
   ::cfn/parameters {"image-id" "some-ami-id"}})

(deftest simple-template
  (testing "template generation doesn't crash"
    (is
     (edn->cfn simple-template-edn))))

(deftest unique-ids-are-checked
  (is (thrown-with-msg?
       Exception #"Duplicate resource ids found: MyEc2Machine"

       (edn->cfn {::cfn/resources [{::cfn/type ::ec2/instance
                                    ::cfn/id "MyEc2Machine"
                                    ::ec2/disable-api-termination false
                                    ::ec2/instance-initiated-shutdown-behaviour "stop"
                                    ::ec2/image-id (cfn/ref "image-id")}

                                   {::cfn/type ::ec2/instance
                                    ::cfn/id "MyEc2Machine"
                                    ::ec2/disable-api-termination false
                                    ::ec2/instance-initiated-shutdown-behaviour "stop"
                                    ::ec2/image-id (cfn/ref "image-id")}]}))))
