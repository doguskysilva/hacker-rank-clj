(ns hacker-rank.thirty-days-code.day-8)

(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def n-contacts (Integer/parseInt (clojure.string/trim (read-line))))

(def phone-book {})

(doseq [_ (range n-contacts)]
  (def contact (clojure.string/trim (read-line)))
  (let [[contact-name contact-phone] (clojure.string/split contact #" ")]
    (def phone-book (assoc phone-book contact-name contact-phone))
    ))


(doseq [_ (range n-contacts)]
  (def search-name (clojure.string/trim (read-line)))
  (if-let [phone-number (get phone-book search-name)]
    (println (str search-name "=" phone-number))
    (println  "Not found")
    )
  )