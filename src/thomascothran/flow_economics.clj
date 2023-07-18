(ns thomascothran.flow-economics
  (:require [nextjournal.clerk :as c])
  (:gen-class))

(defn start-notebooks!
  []
  (c/serve! {:browse? true
             :port 7898
             :watch-paths ["src/thomascothran/notebooks"]}))

(comment
  (start-notebooks!))

(defn build!
  []
  (c/build! {:paths ["src/thomascothran/notebooks/*"]
             :browse? true
             :index "src/thomascothran/notebooks/index.clj"}))

(comment
  (build!))

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))
