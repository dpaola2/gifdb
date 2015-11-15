(defproject gifdb "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [enlive "1.1.6"]
                 [org.clojure/clojure "1.7.0"]
                 ]
  :main ^:skip-aot gifdb.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
