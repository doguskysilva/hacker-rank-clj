(ns hacker-rank.thirty-days-code
  (:require [clojure.test :refer :all]
            [hacker-rank.thirty-days-code.day-2 :as day-two]
            [hacker-rank.thirty-days-code.day-3 :as day-three]
            [hacker-rank.thirty-days-code.day-6 :as day-six]
            [hacker-rank.thirty-days-code.day-7 :as day-seven]
            [hacker-rank.thirty-days-code.day-9 :as day-nine]
            [hacker-rank.thirty-days-code.day-10 :as day-10]
            [hacker-rank.thirty-days-code.day-11 :as day-11]
            ))

(deftest day-two-solve-test
  (testing "Zero parameters should be return 0"
    (is (= (day-two/solve 0 0 0) 0)))
  (testing "Should be return expected values"
    (is (= (day-two/solve 100 15 8) 123))
    (is (= (day-two/solve 12 20 8) 15))
    (is (= (day-two/solve 10.25 17 5) 13))
    (is (= (day-two/solve 15.50 15 10) 19))))

(deftest day-three-solve-test
  (testing "Should be return expected values"
    (is (= (day-three/solve 3) "Weird"))
    (is (= (day-three/solve 2) "Not Weird"))
    (is (= (day-three/solve 8) "Weird"))
    (is (= (day-three/solve 24) "Not Weird"))
    ))

(deftest day-six-solve-test
  (testing "Outups of day six should be valid"
    (is (= ["Duls oga"] (day-six/solve ["Douglas"])))
    (is (= ["abc def"] (day-six/solve  ["adbecf"])))
    (is (= ["Hce akr" "Rn ak"] (day-six/solve  ["Hacker" "Rank"])))))

(deftest day-seven-solve-test
  (testing "Outups of day seven should be valid"
    (is (= "5 4 3 2 1" (day-seven/solve [1 2 3 4 5])))
    (is (= "5 4 3 2 1" (day-seven/solve-recur [1 2 3 4 5])))))

(deftest day-nine-solve-test
  (testing "Outups of day nine should be valid"
    (is (= 1 (day-nine/solve 0)))
    (is (= 1 (day-nine/solve 1)))
    (is (= 6 (day-nine/solve 3)))))

(deftest day-10-solve-test
  (testing "Outups of day 10 should be valid"
    (is (= 5 (day-10/solve 125)))
    (is (= 1 (day-10/solve 5)))
    (is (= 2 (day-10/solve 13)))))

(deftest day-11-solve-test
  (testing "Outups of day 11 should be valid"
    (let [matrix-1 [[1 1 1 0 0 0]
                    [0 1 0 0 0 0]
                    [1 1 1 0 0 0]
                    [0 0 2 4 4 0]
                    [0 0 0 2 0 0]
                    [0 0 1 2 4 0]]
          matrix-2 [[1 1 1 0 0 0]
                    [0 1 0 0 0 0]
                    [1 1 1 0 0 0]
                    [0 0 0 0 0 0]
                    [0 0 0 0 0 0]
                    [0 0 0 0 0 0]]
          matrix-3 [[1 1 1 0 0 0]
                    [0 1 0 0 0 0]
                    [1 1 1 0 0 0]
                    [0 9 2 -4 -4 0]
                    [0 0 0 -2 0 0]
                    [0 0 -1 -2 -4 0]]
          matrix-4 [[0 -4 -6 0 -7 -6]
                    [-1 -2 -6 -8 -3 -1]
                    [-8 -4 -2 -8 -8 -6]
                    [-3 -1 -2 -5 -7 -4]
                    [-3 -5 -3 -6 -6 -6]
                    [-3 -6 0 -8 -6 -7]]]
    (is (= 19 (day-11/solve matrix-1)))
    (is (= 7 (day-11/solve matrix-2)))
    (is (= 13 (day-11/solve matrix-3)))
    (is (= -19 (day-11/solve matrix-4))))))