(ns ylpn-fe-main.views
    (:require [re-frame.core :as re-frame]
              [re-com.core :as re-com]))

;; home

(defn artice-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div
       [:div {:class "ylpn-title level1"} "再见 2016, 你好 2017"]
       [:div {:class "artice-body"}
        [:section {:class "chapter-title ylpn-text"} "2016 年"]
        [:section {:class "chapter-body ylpn-text"} "我占卜了一次，非常灵验，或者被灵验了"]
        [:section {:class "chapter-body ylpn-text"} "我稳定工作了一年，写了一年程序，或者基本没写程序，搭了一年积木"]
        [:section {:class "chapter-body img-container"}
         [:div {:class "work"}]]
        [:section {:class "chapter-body ylpn-text"} "我在工作之余学习了 Clojure/Clojurescript，大学之后重操 Lisp，并在 2016 年的最后一天用 Clojurescript 的一个叫 Re-frame 的框架写了这个页面"]
        [:section {:class "chapter-body ylpn-text"} "我做了几个个人项目，但目前状态都是 \"under-construction\""]
        [:section {:class "chapter-body ylpn-text"} "我只读了不到10本推理小说，其中最好看的是绫辻行人的"
         [:a {:href "https://book.douban.com/subject/25848819/"
              :class "ylpn-links"} "钟表馆事件"]
         "最有病的是麻耶雄嵩的"
         [:a {:href "https://book.douban.com/subject/10546184/"
              :class "ylpn-links"} "夏与冬的奏鸣曲"]]
        [:section {:class "chapter-body ylpn-text"} "我收养了铅笔和橡皮，我和铅笔橡皮都感谢前同事@陆婷婷发现了他们，现在他们将近7个月大了，非常粘人，不定期剪指甲就像2个移动的仙人掌"]
        [:section {:class "chapter-body img-container"}
         [:div {:class "qianbi"}]]
        [:section {:class "chapter-body img-container"}
         [:div {:class "xiangpi"}]]
        [:section {:class "chapter-body ylpn-text"} "我意识到我是那种需要茶叶或者酒来持续生活的那种人，之前25年，大概靠爱发电？"]
        [:section {:class "chapter-body img-container"}
         [:div {:class "wine"}]]
        [:section {:class "chapter-body ylpn-text"} "我病了好几次，并且感觉不能再熬夜了"]
        [:section {:class "chapter-body ylpn-text"} "我在下半年开始定期定时运动，期望能回复体能"]
        [:section {:class "chapter-body img-container"}
         [:div {:class "gym"}]]
        [:section {:class "chapter-title ylpn-text"} "2017 年"]
        [:section {:class "chapter-body ylpn-text"} "爱"]
        [:section {:class "chapter-body ylpn-text"} "健身，控制"]
        [:section {:class "chapter-body ylpn-text"} "读推理，继续学日语"]
        [:section {:class "chapter-body ylpn-text"} "加强工作中涉及到的理论知识的学习"]
        [:section {:class "chapter-body ylpn-text"} "计划用 React Native 写一个能上架 App Store 的 App，解决我在上海街头临时找厕所的需求 ;)"]
        [:section {:class "chapter-body ylpn-text"} "继续编程，工作，爱她干她"]]
       [:div {:class "footer-note"}
        [:span {:class "ylpn-text "} "made with "]
        [:span {:class "ylpn-text heart"} " ♥  "]
        [:span {:class "ylpn-text "} "by "]
        [:a {:href "#/man-younglee"
                  :class "ylpn-links"} @name]]])))


;; about

(defn about-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div
       [:div {:class "artice-body"}
        [:section {:class "chapter-text ylpn-about"}
         [:a {:href "mailto:youngleemails@gamil.com"
              :class "ylpn-links"} "Young Lee"]
         ", a programming motherfucker."]]
       [:div {:class "footer-note"}
        [:a {:href "#/"
             :class "ylpn-links"} "Back to where it belong"]]])))

;; main

(defn- panels [panel-name]
  (case panel-name
    :home-panel [artice-panel]
    :about-panel [about-panel]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [:active-panel])]
    (fn []
      [show-panel @active-panel])))
