(defn find-last [nums] 
  (if (empty? (rest nums))
     (first nums)
   (find-last (rest nums))))

(def input [1 2 79])
