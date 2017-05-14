(ns oblique.routes
  (:require [yada.yada :as yada]))

(defn routes []
  (yada/handler
   "Hello World!"))