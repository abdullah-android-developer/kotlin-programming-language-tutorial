// Code:-

// if-else statements are conditional statements.

fun main() {
	// if-else without returning something
	val age: Int = 89
	if (age >= 18 && age < 90) {
		println("You can vote!")
	} else if (age == 17) {
		println("Come to our office and then we will decide you can vote or not!")
	} else if (age <= 16) {
		println("Sorry! You can't vote!")
	} else {
		println("Something Bad Occured!")
	}
	/*
 		Output:-
 			You can vote!
 */
	// if-else with returning something
	val percentage: Float = 49.00F
	var decideGrade: String = if (percentage >= 90.00) {
		"Grade A+"
	} else if (percentage <= 89.00 && percentage >= 60.00) {
		"Grade B+"
	} else if (percentage <= 59 && percentage >= 50) {
		"Grade C+"
	} else {
		"Failed"
	}
	print(decideGrade)
}