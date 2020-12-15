// Code:-

// when case statements are conditional statements.

fun main() {
	// when case without returning anything
	var dayOfTheWeek: String = "Thursday"
	when (dayOfTheWeek) {
		"Monday"-> {
			println("Working Day Monday!")
		}
		"Tuesday"-> {
			println("Working Day Tuesday!")
		}
		"Wednesday"-> {
			println("Working Day Wednesday!")
		}
		"Thursday"-> {
			println("Working Day Thursday!")
		}
		"Friday"-> {
			println("Half Working Day Friday!")
		}
		"Saturday"-> {
			println("Holiday Saturday!")
		}
		"Sunday"-> {
			println("Holiday Sunday!")
		}
		else-> {
			println("Not the Day Of The Week!")
		}
	}
	/*
 		Output:-
 			Working Day Thursday!
 */
	// when case with returning something
	var bool: Boolean = false
	var zeroOrOneOr404: Int = when(bool) {
		true-> {
			1
		}
		false-> {
			0
		}
		else-> {
			404
		}
	}
	println(zeroOrOneOr404)
}