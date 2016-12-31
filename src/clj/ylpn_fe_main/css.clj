(ns ylpn-fe-main.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:body {:color "red"
          :background-color "#333333"}]
  [:.level1 {:color "#d7d7d7"}]
  [:.ylpn-links {:color "#9f79ee"
                 :text-decoration "none"}])
