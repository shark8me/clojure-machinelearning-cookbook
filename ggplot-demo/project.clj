(defproject ggplot-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.0.2"]
                 [com.taoensso/timbre "4.3.1"]
                 [incanter/incanter-core "1.9.1-SNAPSHOT"]
                 [incanter/incanter-io "1.9.1-SNAPSHOT"]
                 [net.mikera/vectorz-clj "0.44.1"]]
 :plugins [[lein-environ "1.0.3"]
            [lein-gorilla "0.3.6.1"]] 
 :profiles  {:default [:dev :gorilla]
              :gorilla {:dependencies  [[incanter-gorilla "0.1.0.1"]
                                        [gg4clj "0.1.1-SNAPSHOT"]]}})
