package main

import "fmt"

func main() {
	var num1 float64
	var num2 float64
	fmt.Scanln(&num1)
	fmt.Scanln(&num2)
	var result float64 = (num1 * 3.5 + num2 * 7.5) / 11
	fmt.Printf("MEDIA = %.5f\n", result)
}
