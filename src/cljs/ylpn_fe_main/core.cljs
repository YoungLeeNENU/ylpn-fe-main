(ns ylpn-fe-main.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [devtools.core :as devtools]
              [ylpn-fe-main.handlers]
              [ylpn-fe-main.subs]
              [ylpn-fe-main.routes :as routes]
              [ylpn-fe-main.views :as views]
              [ylpn-fe-main.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")
    (devtools/install!)))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
