(let [num1 (do (Double/parseDouble (read-line))) 
     num2 (do (Double/parseDouble (read-line)))] 
  (println (format "MEDIA = %.5f" (/ (+ (* num1 3.5) (* num2 7.5)) 11))))
