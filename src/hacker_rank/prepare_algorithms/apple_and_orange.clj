(ns hacker-rank.prepare-algorithms.apple-and-orange)

(defn is-between-interval? [start end position]
  (and (>= position start) (<= position end))
  )

(defn countApplesAndOranges [s t a b apples oranges]
  (let [positions-apples (map #(+ a %) apples)
        positions-oranges (map #(+ b %) oranges)]
    [
     (count (filter #(is-between-interval? s t %) positions-apples))
     (count (filter #(is-between-interval? s t %) positions-oranges))]))
