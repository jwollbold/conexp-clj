;; Copyright (c) Daniel Borchmann. All rights reserved.
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file LICENSE at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

(ns conexp.contrib.tests.retracts
  (:use conexp.main
        conexp.contrib.retracts)
  (:use clojure.test))

;;;

(deftest test-retracts-simple
  (= 1 (count (retracts (diag-context [1 2 3]))))
  (= 10 (count (retracts (adiag-context [1 2 3]))))
  (= 41 (count (retracts (adiag-context [1 2 3 4])))))

;;;

nil
