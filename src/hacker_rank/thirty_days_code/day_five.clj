(ns hacker-rank.thirty-days-code.day-five)

(defn solve [n]
  (doseq [x (range 1 11)]
    (let [result (* x n)]
      (println n "x" x "=" result))))