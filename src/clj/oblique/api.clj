(ns oblique.api
  (:require
   [yada.yada :as yada]))

(defn api [db]
  ["/api/1.0"
   {"/status" (yada/resource {:response "API working!"})
    "/ctx" (yada/resource {:response (fn [ctx] (str ctx))})}])

;; Turn the route structure into a Ring handler
(defn handler [] (yada/handler (api nil)))