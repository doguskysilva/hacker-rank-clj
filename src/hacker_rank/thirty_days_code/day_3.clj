(ns hacker-rank.thirty-days-code.day-3)

(defn solve [n]
  (cond
    (or
      (odd? n)
      (and (even? n) (>= n 6) (<= n 20))) "Weird"
    (or
      (and (even? n) (>= n 2) (<= n 5))
      (and (even? n) (> n 20))) "Not Weird"))
