(ns ylpn-fe-main.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 :name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 :cursor-show
 (fn [db]
   (:cursor-show db)))

(re-frame/reg-sub
 :active-panel
 (fn [db _]
   (:active-panel db)))
