(ns hacker-rank.prepare-algorithms.number-line-jumps)

(defn kangaroo [x1 v1 x2 v2]
  (cond
    (>= v2 v1) "NO"
    (= 0 (mod (- x1 x2) (- v2 v1))) "YES"
    :else "NO"
    ))
