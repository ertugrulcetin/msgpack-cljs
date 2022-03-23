(defproject org.clojars.ertucetin/msgpack-cljs "0.1.2"
  :description "A ClojureScript library for serializing and deserializing to msgpack."
  :license {:name "APACHE LICENSE, VERSION 2.0 (CURRENT)"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :source-paths ["src"]
  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :compiler
                {:output-to "static/development/index.js"
                 :source-map true
                 :output-dir "static/development/js"
                 :optimizations :none
                 :main msgpack-cljs.core
                 :asset-path "/development/js"
                 :cache-analysis true
                 :pretty-print true}}
               {:id "release"
                :source-paths ["src"]
                :compiler
                {:output-to "static/release/index.js"
                 :source-map "static/release/index.js.map"
                 :main msgpack-cljs.core
                 :output-dir "static/release/js"
                 :optimizations :advanced
                 :pseudo-names false}}]})
