(ns hacker-rank.thirty-days-code.day-11)



(defn solve [matriz]
  (def hourglasses [])
  (doseq [x (range 0 4)]
           (doseq [y (range 0 4)]
             (let [row-1 (subvec (get matriz x) y (+ 3 y))
                   row-2 (subvec (get matriz (+ x 1)) (+ y 1) (+ 2 y))
                   row-3 (subvec (get matriz (+ x 2)) y (+ 3 y))
                   sum-hourglass (reduce + (concat row-1 row-2 row-3))
                   ]
               (def hourglasses (conj hourglasses sum-hourglass)))))
  (reduce max hourglasses))


(def input [[1 1 1 0 0 0]
            [0 1 0 0 0 0]
            [1 1 1 0 0 0]
            [0 9 2 -4 -4 0]
            [0 0 0 -2 0 0]
            [0 0 -1 -2 -4 0]])


