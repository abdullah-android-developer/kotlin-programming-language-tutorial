// Code:-

// Ranges In Kotlin:-

fun main() {
	// Making a Range without taking steps
	for (x in 1..10) {
		println("Range: ${x}")
		if (x == 10) {
			println("----------")
		}
	}
	// Making a Range with taking 2 steps
	for (x in 1..10 step 2) {
		println("Range: ${x}")
		if (x == 9) {
			println("----------")
		}
	}
	// Making a downTo Range with taking 2 steps
	for (x in 10 downTo 1 step 2) {
		println("Range: ${x}")
		if (x == 2) {
			println("----------")
		}
	}
	// Making some conditions with Range
	val idOne: Int = 2727
	if (idOne in 2000..4000) {
		println("This Id Exists in our records!")
	} else {
		println("This Id Does Not Exists in our records!")
	}
}