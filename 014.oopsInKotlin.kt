// Code:-

// OOP'S In Kotlin:-

// Class In Kotlin Without Properties in Constructor:-
public class Student constructor(_name: String, _id: Int) {
	var name: String
	var id: Int
	init {
		name = _name
		id = _id
		println("Object Created! Of Student Class")
	}
}

// Class In Kotlin With Properties in Constructor:-
public class Employee constructor(val name: String, val id: Int) {
	init {
		println("Object Created! Of Employee Class")
	}
}

// Data Class In Kotlin
data class Cities constructor(val name: String, val cityCode: String)

fun main() {
	// Making Object Of Student Class
	var studentOne = Student("Abdullah Sajjad", 2727)
	println("Student Name: ${studentOne.name} Student Id: ${studentOne.id}")
	// Making Object Of Employee Class
	var employeeOne = Employee("Abu Bakar", 2192)
	println("Employee Name: ${employeeOne.name} Employee Id: ${employeeOne.id}")
}