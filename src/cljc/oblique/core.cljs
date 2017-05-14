(ns oblique.core
  (:require [reagent.core :as reagent]))

;; -------------------------
;; Views

(defn home-page []
  [:div
   [:h2 "Oblique Code"]
   [:p "This is it"]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
