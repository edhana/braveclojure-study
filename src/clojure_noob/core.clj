(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a  little teapot!"))

(println "Cleanliness is next to godliness")

(defn train
  []
  (println "Choo choo!"))
(train)

; set example
(hash-set 1 1 2 2) ; output {1 2}
(conj #{:a :b} :b) ; do not add anything

(defn greet [name & rest] (apply println "Hello" name rest))
(greet "Dudu" "Wes" "Brunao" "Samu")

; getting value from hashset
(println (str "Printing number from vector [1 2 3 4]: " (get [1 2 3 4] 2)))

({:a "teste" :b "arroz"} :a)

(vector "teste 1" " depois do " "novo teste")

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if(= severity :mild)
         "MILDLY INCONVENIENCE!"
         "DOOMED!")))
(println (error-message :mild))
(println (error-message :great))

;; maps
(def test-names {:first-name "Charlie" :last-name "McFishwich"})

;; getting values (with default return) from a map
(get {:a 0 :b 1} :c "unicorns?")

;; using keyword as function
(println (:a {:a "papai" :b "tcheca"}))

;; using vectors
(println (get [4 3 1] 0))

;; creating a vector with vector function
(println (vector "test 1" "test 2" "test 3" 4))

;; lists
(println '(1 2 3 4))
(println (nth '(:a :b 3) 1))
(println (list 1 "two" {3 4}))
(println (conj '(1 2 3) 4))

;; sets -- as in other languages: collection of unique values
;; Hash set example (there is also a sorted set type)
(println #{"kurt cobain" 20 :icicle})
(println (hash-set 1 1 2 2))
;; creating a set from existing vector
(println (set [3 3 4 4 3 2 5 2]))
(println (contains? (set [3 3 4 4 3 2 5 2]) 3))
(println (contains? (set [3 3 4 4 3 2 5 2]) 7))
(println
 (contains?
  (set [3 3 4 4 3 2 5 2]) 7))
