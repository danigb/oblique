(ns oblique.server
  (require [aleph.http :as http]
           [oblique.api :as api]
           [mount.core :refer [defstate]]))

(defn old-handler [req]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "hello server!"})

(defn start []
  (http/start-server (api/handler) {:port 8080}))

(defn stop [server]
  (.close server))

(defstate server :start (start)
  :stop (stop server))