(defproject louna-spark-def-guide "0.2.0-SNAPSHOT"
  :description "Solutions for the book Spark: The Definitive Guide,using the louna-spark library"
  :url "https://github.com/tkaryadis/louna-spark"
  :license {:name "Apache License"
            :url  "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.wjoel/clj-bean "0.2.1"]
                 [org.apache.spark/spark-core_2.11 "2.4.0"]   
                 [org.apache.spark/spark-sql_2.11 "2.4.0"]
                 [org.postgresql/postgresql "42.2.5"]
                 [louna/louna-spark "0.1.0-SNAPSHOT"]]
  :aot [
        ;For testing only,remove comment and run with leinigein
        ;sparkdefinitive.ch2Intro
        ;sparkdefinitive.ch3IntroTools
        ;sparkdefinitive.ch4and5
        ;sparkdefinitive.ch6DataTypes
        ;sparkdefinitive.ch7Aggregations
        ;sparkdefinitive.ch8Joins
        ;sparkdefinitive.ch11Datasets
        ;sparkdefinitive.ch12RDD1
        ;sparkdefinitive.ch13RDD2
        ;sparkdefinitive.ch21Streaming

        ;louna-tests.variables-constants-nested
        ;louna-tests.udf
        ;louna-tests.udafAvg
        ;louna-tests.udaf

        ;apps.wordcount
        ;apps.temp

        ])
