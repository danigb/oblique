
(ns dev
  (:require
   [clojure.pprint :refer [pprint]]
   [clojure.test :refer [run-all-tests]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir doc find-doc pst source]]
   [clojure.tools.namespace.repl :refer [refresh refresh-all]]
   [clojure.java.io :as io]
   [mount.core :as mount]
   [clojure.core.async :as a :refer [>! <! >!! <!! chan buffer dropping-buffer sliding-buffer close! timeout alts! alts!! go-loop]]
   ; [reloaded.repl :refer [system init start stop go reset reset-all]]
   ; [schema.core :as s]
   [yada.test :refer [response-for]]
   [oblique.server]))

(defn test-all []
  (run-all-tests #"oblique.*test$"))

(defn go []
  (mount/start)
  :ready)

(defn reset []
  (mount/stop)
  (refresh :after 'dev/go))

