(ns gifdb.core
  (:require [net.cgrand.enlive-html :as html])
  (:gen-class))

(defn fetch-page [url]
  (html/html-resource (java.net.URL. url)))

(defn extract-hrefs [imgs]
  ((imgs :attrs) :href)
  )

(defn fetch-image-urls [url]
  (map
   extract-hrefs
   (html/select (fetch-page url) [:a])))

(defn gif? [url]
  (and
   (not (nil? url))
   (.contains url ".gif")))

(defn fetch-gif-urls [url]
  (remove
   (fn [x]
     (not (gif? url)))
   (fetch-image-urls url)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
