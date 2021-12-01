(ns hacker-rank.prepare-algorithms-test
  (:require [clojure.test :refer :all]
            [hacker-rank.prepare-algorithms.grading-students :as grading-students]))

(deftest grading-students-test
  (testing "Outputs of grading students should be valid"
    (is (= [75 67 40 33] (grading-students/gradingStudents [73 67 38 33])))))