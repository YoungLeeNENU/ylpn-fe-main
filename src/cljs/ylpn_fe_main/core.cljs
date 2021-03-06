(ns ylpn-fe-main.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [re-frisk.core :refer [enable-re-frisk!]]
              [ylpn-fe-main.events]
              [ylpn-fe-main.subs]
              [ylpn-fe-main.routes :as routes]
              [ylpn-fe-main.views :as views]
              [ylpn-fe-main.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    ;; (enable-re-frisk!)                  ;for debug
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
