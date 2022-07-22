
fun main(args: Array<String>) {
    println("Welcome to Kotlin Playground!")
    println("My personal testing application for kotlin stuff.")

    println("Type 'help' for help")
}

//--------------------------------------------------------------------------------------------------------------------//
// Section 1: Basic Concepts
//--------------------------------------------------------------------------------------------------------------------//

// Variables are declared using the 'var' keyword.
// 'var' => variable is changeable
// 'val' => variable is not changeable
var num: Int = 42
val letter: Char = 'b'

// Kotlin feature: Type inference
// Type inference => Kotlin automatically sets the data type to the referred variable value
var James = "James"

// Input
var age = readLine()

// Input is asserted null by inserting '!!' and parsed to Double by writing 'toDouble()'
var age2 = readLine()!!.toDouble()

//--------------------------------------------------------------------------------------------------------------------//
// Section 2: Conditional Expressions
//--------------------------------------------------------------------------------------------------------------------//

// If Statements as variable value
val num2 = -7
val result = if (num > 0) "Positive" else "Negative"
// println(result)

// When Statements
val num3 = -7
val result2 = when {
    num3 > 0 -> "Positive"
    num3 < 0 -> "Negative"
    else -> "Not a number or zero"
}

// Arrays
var exampleArray = arrayOf("John", "Tim", "Max")

// Ranges
/**
 * for (i in 2..5)
 */

// In
var num4 = 42
/**
 * if(x in 15..100) {
 * println("Yes")
 * }
 */


