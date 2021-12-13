(ns hacker-rank.thirty-days-code.day-2)

(defn value-of-percent [base_value value_percent]
  (* (/ value_percent 100) base_value))

(defn solve [meal_cost tip_percent tax_percent]
  (let [tip_value (value-of-percent meal_cost tip_percent)
        tax_value (value-of-percent meal_cost tax_percent)]
    (Math/round (double (+ meal_cost tip_value tax_value)))))
