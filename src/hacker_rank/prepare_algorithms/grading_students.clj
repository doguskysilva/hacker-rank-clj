(ns hacker-rank.prepare-algorithms.grading-students)

(defn next-multiple [grade multiple]
  (+ grade (- multiple (rem grade multiple))))

(defn round-number [grade]
  (let [multiple 5
        limit-to-round 3
        next-grade (next-multiple grade multiple)
        minimal-grade 38]
    (if (and (>= grade minimal-grade) (< (- next-grade grade) limit-to-round))
      next-grade
      grade)))

(defn gradingStudents [grades]
  (map round-number grades))
