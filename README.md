# edn-to-cfn

This is a WIP tool to generate AWS CloudFormation templates form Clojure data.

Goals:

- Creating a spec for AWS CloudFormation as edn
- Good error messages (via spec and expound)

Antigoals:

- Templating tools (just use Clojure to create the datastructures)