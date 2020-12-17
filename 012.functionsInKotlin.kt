// Code:-

// Functions in Kotlin:-

fun main() {
	// Making Function that cannot returns anything
	fun tellName() {
		println("Name is Abdullah Sajjad")
	}
	tellName() // Calling function
	// Making Function that can returns something
	fun sum(num1: Int, num2: Int) : Int {
		return num1 + num2
	}
	println("The Sum is ${sum(100, 200)}")
	// Making function that can return something but have optional parameters
	fun greet(greeting: String = "Good Day") : String {
		return "${greeting} Abdullah"
	}
	println(greet())
	// Making function that can return something but have optional parameters and can change the positions of its parameters when calling them
	fun greetByName(greeting: String = "Good Day", name: String = "Guest") : String {
		return "${greeting}! ${name}"
	}
	println(greetByName(name = "Abu Bakar", greeting = "Good Evening"))
	// Making a function that can return something but in a short way with params
	fun product(num1: Float, num2: Float) : Float = num1 * num2
	println(product(98.98F, 58.58F))
}