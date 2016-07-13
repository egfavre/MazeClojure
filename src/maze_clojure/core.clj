(ns maze-clojure.core
  (:gen-class))

(def size 10)

(defn create-rooms []
  (vec
    (for [row (range 0 size)]
      (vec
        (for [col (range 0 size)]
          {:row row :col col :visited? false :bottom? true :right? true})))))
         

(defn -main []
  (let [ rooms (create-rooms)]
    (doseq [row rooms]
      (print " _"))
    (println)
    (doseq [row rooms]
      (print "|")
      (doseq [room row]
        (print (if (:bottom? room) "_" " "))
        (print (if (:right? room) "|" " ")))
      (println))))
    
