// Code:-

// Filter and Map In Kotlin:-

fun main() {
    val numbers = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    numbers.filter({
        it % 2 == 0
    }).map({
        it * it
    }).forEach({
        println("Even Number Square: ${it}")
    })
}