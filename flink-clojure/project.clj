(defproject flink-clojure "0.1.0-SNAPSHOT"
  :description "Small example on how to write a Flink program in Clojure"
  :url "https://github.com/mjsax/flink-external/tree/master/flink-clojure"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.flink/flink-clients_2.11 "1.6.1"]]
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :test-paths ["src/test/clojure"]
  :resource-paths ["src/main/resource"]
  :aot  [org.apache.flink.clojure.WordCount]
  :main org.apache.flink.clojure.WordCount)
