(ns ylpn-fe-main.views
    (:require [re-frame.core :as re-frame]
              [re-com.core :as re-com]))


;; Home
(defn home-title []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [re-com/title
       :label (str @name "'s Personal Network")
       :level :level1])))

(defn link-to-about-page []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [re-com/hyperlink-href
       :class "ylpn-links"
       :label (str "About " @name)
       :href "#/man-younglee"])))

(defn home-panel []
  [re-com/v-box
   :gap "5px"
   :children [[home-title] [link-to-about-page]]])


;; About
(defn about-title []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [re-com/title
       :label (str @name ", programs in Javascript, Python, Clojure and C")
       :level :level1])))

(defn link-to-home-page []
  [re-com/hyperlink-href
   :class "ylpn-links"
   :label "go to Home Page"
   :href "#/"])

(defn about-panel []
  [re-com/v-box
   :gap "1em"
   :children [[about-title] [link-to-home-page]]])


;; main

(defmulti panels identity)
(defmethod panels :home-panel [] [home-panel])
(defmethod panels :about-panel [] [about-panel])
(defmethod panels :default [] [:div])

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [:active-panel])]
    (fn []
      [re-com/v-box
       :height "100%"
       :children [[panels @active-panel]]])))
