(defproject specter-dataset-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [net.mikera/core.matrix "0.52.0"]
                 [com.rpl/specter "0.11.0"]
                 [incanter/incanter-core "1.9.1-SNAPSHOT"]
                 [incanter/incanter-io "1.9.1-SNAPSHOT"]
                 [net.mikera/vectorz-clj "0.44.1"]]
  :profiles  {:gorilla {:dependencies  [[incanter-gorilla "0.1.0.1"]]}}
  :plugins [[lein-gorilla "0.3.6"]]
  )
