(ns gifdb.core
  (:require [net.cgrand.enlive-html :as html])
  (:gen-class))

(defn fetch-page [url]
  (html/html-resource (java.net.URL. url)))

(defn extract-sources [image-list]
  ((image-list :attrs) :src)
  )

(defn fetch-images [url]
  (map
   extract-sources
   (html/select (fetch-page url) [:img])))

(defn fetch-gifs [url]
  (remove
   (fn [x] (not (.contains x ".gif")))
   (fetch-images url))
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
