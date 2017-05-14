(defproject oblique "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.9.495" :scope "provided"]
                 [yada "1.2.2"]
                 [bidi "2.1.0"]
                 [mount "0.1.11"]
                 [reagent "0.6.1"]]

  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-cljfmt "0.5.6"]
            [lein-figwheel "0.5.9"]]

  :min-lein-version "2.5.0"

  :repl-options {:init-ns user
                 :welcome (println "Type (dev) to start")}

  :uberjar-name "oblique.jar"

  :clean-targets ^{:protect false}
  [:target-path
   [:cljsbuild :builds :app :compiler :output-dir]
   [:cljsbuild :builds :app :compiler :output-to]]

  :resource-paths ["public"]

  :figwheel {:http-server-root "."
             :nrepl-port 7002
             :nrepl-middleware ["cemerick.piggieback/wrap-cljs-repl"]
             :css-dirs ["public/css"]}

  :cljsbuild {:builds {:app
                       {:source-paths ["src/cljs" "src/cljc" "env/dev/cljs"]
                        :compiler
                        {:main "oblique.dev"
                         :output-to "public/js/app.js"
                         :output-dir "public/js/out"
                         :asset-path   "js/out"
                         :source-map true
                         :optimizations :none
                         :pretty-print  true}
                        :figwheel
                        {:open-urls ["http://localhost:3449/index.html"]}}
                       :release
                       {:source-paths ["src/cljs" "src/cljc" "env/prod/cljs"]
                        :compiler
                        {:output-to "public/js/app.js"
                         :output-dir "public/js/release"
                         :asset-path   "js/out"
                         :optimizations :advanced
                         :pretty-print false}}}}

  :aliases {"release" ["do" "clean" ["cljsbuild" "once" "release"]]}

  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.9"]
                                  [org.clojure/tools.namespace "0.2.11"]
                                  [org.clojure/tools.nrepl "0.2.12"]
                                  [com.cemerick/piggieback "0.2.2-SNAPSHOT"]]
            :source-paths ["dev" "src/clj" "src/cljs"]}

              :debug-repl {:resource-paths [#=(eval (System/getenv "/Library/Java/JavaVirtualMachines/jdk1.8.0_40.jdk/Contents/Home/lib/tools.jar"))]
              :repl-options {:nrepl-middleware [debug-middleware.core/debug-middleware]}
              :dependencies [[debug-middleware #=(eval (System/getenv "DEBUG_MIDDLEWARE_VERSION"))]]
              }})

