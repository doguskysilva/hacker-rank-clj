(ns hacker-rank.thirty-days-code
  (:require [clojure.test :refer :all]
            [hacker-rank.thirty-days-code.day-two :as day-two]))

(deftest day-two-solve-test
  (testing "Zero parameters should be return 0"
    (is (= (day-two/solve 0 0 0) 0)))
  (testing "Should be return expected values"
    (is (= (day-two/solve 100 15 8) 123))
    (is (= (day-two/solve 12 20 8) 15))
    (is (= (day-two/solve 10.25 17 5) 13))
    (is (= (day-two/solve 15.50 15 10) 19))))