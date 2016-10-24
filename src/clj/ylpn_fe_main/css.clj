(ns ylpn-fe-main.css
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px em]]))

(defstyles homepage
  [:body {:background-color "#333333"
          :font-size (px 20)}]
  [:.level1 {:color "#ffffff"}]
  )

(defstyles sample
  [:.test {:border "1px solid #e1e1e1"}
   [:.inner-test {:border-radius (px 4)}]]
  )
