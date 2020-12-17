// Code:-

// Lists In Kotlin:-

fun main() {
	// Lists are Immutable by default in kotlin
	
	// Making a Immutable List
	val listOfNames = listOf("Muhammad", "Abu Bakar", "Abdullah", "Ali")
	// Making a Mutable List
	var listOfIds = mutableListOf("Abullah", 2727)
	// Making a Mutable List of Specific DataType
	var listOfAnimals = mutableListOf<String>("Lion", "Tiger", "Panda", "Monkey")
	// Printing All Of These
	println(listOfNames[2])
	println(listOfIds[1])
	println(listOfAnimals[1])
}