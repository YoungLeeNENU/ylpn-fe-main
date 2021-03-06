(ns ylpn-fe-main.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:body {:color "red"
          :background-color "#161A1F"}]
  [:.hide {:display "none"}]
  [:.wx-img {:height "400px"
             :width "400px"}]
  [:.level1 {:color "#d7d7d7"}]
  [:.ylpn-links {:color "#1e90ff"
                 :text-decoration "none"
                 :text-align "center"}]
  [:.ylpn-title {:font-size "28px"
                 :line-height "58px"
                 :text-align "center"}]
  [:.ylpn-about {:margin-top "15px"
                 :font-size "14px"
                 :line-height "20px"
                 :color "#d7d7d7"
                 :text-align "center"}]
  [:.artice-body {:margin-left "15px"
                  :margin-right "15px"
                  :margin-bottom "15px"}
   [:.chapter-body {:line-height "20px"
                    :margin-bottom "12px"}]
   [:.chapter-title {:font-size "22px"
                     :line-height "24px"
                     :text-align "center"}]]
  [:.ylpn-text {:color "#d7d7d7"
                :font-size "14px"}]
  [:.heart {:color "red"}]
  [:.footer-note {:line-height "22px"
                  :text-align "center"
                  :margin-bottom "15px"}]
  [:.cursor {:display "inline-block"
             :background-color "#ee4000"
             :height "14px"
             :width "6px"
             :margin-left "2px"}]
  [:.img-container {:text-align "center"}]
  [:.work {:background-image "url('../img/work.jpeg')"
           :background-repeat "no-repeat"
           :background-size "100% 100%"
           :height "280px"
           :width "280px"
           :display "inline-block"}]
  [:.qianbi {:background-image "url('../img/qianbi.jpeg')"
             :background-repeat "no-repeat"
             :background-size "100% 100%"
             :height "280px"
             :width "280px"
             :display "inline-block"}]
  [:.xiangpi {:background-image "url('../img/xiangpi.jpeg')"
              :background-repeat "no-repeat"
              :background-size "100% 100%"
              :height "280px"
              :width "280px"
              :display "inline-block"}]
  [:.wine {:background-image "url('../img/wine.jpeg')"
              :background-repeat "no-repeat"
              :background-size "100% 100%"
              :height "280px"
              :width "280px"
              :display "inline-block"}]
  [:.gym {:background-image "url('../img/gym.jpeg')"
              :background-repeat "no-repeat"
              :background-size "100% 100%"
              :height "280px"
              :width "280px"
              :display "inline-block"}]
  )
