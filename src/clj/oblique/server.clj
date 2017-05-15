(ns oblique.server
  (require [aleph.http :as http]
           [yada.yada :as yada]
           [yada.handler :refer [as-handler]]
           [mount.core :refer [defstate]]))

(defn status-resource [] 
  (yada/resource 
    {:methods 
      {:get 
        {:produces "text/plain"
         :response "API working!"}}}))

(defn api []
  ["/api", 
    {"/status" (status-resource)}
    {"/ctx" (yada/resource {:response (fn [ctx] (str ctx))})}])

(defn handler [routes] (as-handler routes))

(defn start []
  (http/start-server (handler (api)) {:port 8080}))

(defn stop [server]
  (.close server))

(defstate server :start (start)
  :stop (stop server))