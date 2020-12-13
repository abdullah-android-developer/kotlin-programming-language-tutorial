// Code:-

// Variables, DataTypes, and String Templates:-

/*
 	What are Variables?
 		- Variables stores values of particular Data Type in it.
 
 	What are Data Types?
 		- Data Types means of which type of data are we storing in the variable.
 
 	What are String Templates?
 		- String Templates are used to use variables in string.
 */

fun main() {
	// Making Variables
	
	// Making Variables By Providing DataType
	// 1. var is a keyword to make mutable variables.
	// 2. The carName is the variable name.
	// 3. Then we put a : (colon) sign.
	// 4. Then we give it a DataType.
	// 5. Then we put a = (assignment) sign.
	// 6. Then we assign it the value of the particular DataType we give it.
	var carName: String = "Volvo"
	// 1. val is a keyword to make immutable variables.
	// 2. The carPrice is the variable name.
	// 3. Then we put a : (colon) sign.
	// 4. Then we give it a DataType.
	// 5. Then we put a = (assignment) sign.
	// 6. Then we assign it the value of the particular DataType we give it.
	val carPrice: Int = 3000000;
	
	// Making Variables By Not Providing DataType
	var bikeName = "Honda"
	val bikePrice = 100000;
	
	// String Templates
	print("Car Name: ${carName} Car Price: ${carPrice} | Bike Name: ${bikeName} Bike Price: ${bikePrice}")
}

/*
 	Output:-
 		Car Name: Volvo Car Price: 3000000 | Bike Name: Honda Bike Price: 100000
 */