(ns hacker-rank.thirty-days-code.day-9)

(defn solve [n]
  (if (or (= n 0) (= n 1))
    1
    (* n (solve (- n 1)))))