(ns hacker-rank.thirty-days-code.day-6)

(defn rec [word evens odds iter]
  (if word
    (rec
      (next word)
      (if (even? iter) (conj evens (first word)) evens)
      (if (odd? iter) (conj odds (first word)) odds)
      (inc iter))
    [(apply str odds) (apply str evens)]))

(defn space-string [word]
  (clojure.string/join " " (rec (seq word) [] [] 1)))

(defn solve [words]
  (map space-string words))