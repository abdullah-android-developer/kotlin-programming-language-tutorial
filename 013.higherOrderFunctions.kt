// Code:-

// Higher-Order Functions In Kotlin:-

/*
 	What are Higher-Order Functions?
 		- Higher-Order Functions can accept functions as arguments.
 		- Higher-Order Functions can return functions.
 		- Higher-Order Functions can do both.
 */

fun sum(a: Double, b: Double) : Double {
	return a + b
}

fun subtract(a: Double, b: Double) : Double {
	return a - b
}
fun product(a: Double, b: Double) : Double {
	return a * b
}

fun divide(a: Double, b: Double) : Double {
	return a / b
}

// Higher-Order Function
fun calculate(a: Double, b: Double, operation: (Double, Double) -> Double) : Double {
	val result = operation(a, b)
	return result
}

fun main() {
	// Sum Calculation
	println(calculate(10.10, 10.20, ::sum))
	// Subtract Calculation
	println(calculate(20.10, 10.20, ::subtract))
	// Product Calculation
	println(calculate(2.00, 2.00, ::product))
	// Division Calculation
	println(calculate(20.00, 10.00, ::divide))
}