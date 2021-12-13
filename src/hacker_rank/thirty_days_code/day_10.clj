(ns hacker-rank.thirty-days-code.day-10)

(defn base-10->binary-string [n binary-string]
  (if (> n 0)
    (base-10->binary-string (quot n 2) (str (mod n 2) binary-string))
    binary-string
    ))

(defn solve [n]
  (let [binary-string (base-10->binary-string n "")
        seq-ones (clojure.string/split binary-string #"0")]
    (->> seq-ones
         (map count)
         (reduce max))))