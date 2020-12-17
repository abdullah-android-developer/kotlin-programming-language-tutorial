// Code:-

// Loops in Kotlin:-

fun main() {
	// For Loop
	var names = arrayOf("Muhammad", "Abdullah", "Ali", "Abu Bakar", "Usman", "Umer")
	for (name in names) {
		println("Name: ${name}")
		if (name == "Umer") {
			println("--------------------")
			break
		} else {
			continue
		}
	}
	// For-each Loop
	var cars = arrayOf("Volvo", "Honda", "Toyota", "Audi")
	cars.forEach {
		println("Car: ${it}")
		if (it == "Audi") {
			println("--------------------")
		}
	}
	// While Loop
	var numberOne: Int = 0
	while (numberOne <= 10) {
		println("Number One: ${numberOne}")
		numberOne++
		if (numberOne >= 10) {
			println("--------------------")
			break
		} else {
			continue
		}
	}
	// do-while Loop
	var numberTwo: Int = 0
	do {
		println("Number Two: ${numberTwo}")
		numberTwo++
	} while (numberTwo <= 10)
}