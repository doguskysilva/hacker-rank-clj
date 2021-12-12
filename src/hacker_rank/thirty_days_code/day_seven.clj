(ns hacker-rank.thirty-days-code.day-seven)

(defn solve [numbers]
  (clojure.string/join " " (reverse numbers)))

(defn add-space? [numbers string]
  (and (not (empty? string)) (not (empty? numbers))))

(defn reverse-string [numbers spaced-string]
  (let [new-character (if (add-space? numbers spaced-string) (str " " spaced-string) spaced-string)]
    (if (not (nil? numbers))
      (reverse-string (next numbers) (str (first numbers) new-character))
      spaced-string)))

(defn solve-recur [numbers]
   (reverse-string numbers ""))

