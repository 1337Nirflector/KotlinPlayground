
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

//--------------------------------------------------------------------------------------------------------------------//
// Section 3: Functions
//--------------------------------------------------------------------------------------------------------------------//

// Default Methods with Parameter(s)
/**
 * fun (name: String)
 * First, the name of the variable. Then, the data type.
 */

// Returning Methods
/**
 * fun (name: String) String
 * Function that returns a String
 */

// Anonymous Methods
/**
 * val f: (Int, Int) -> Int = { a, b -> a+b }
 * Anonymous function that takes 'a' and 'b' as method parameters (Integers) and returns its sum as an Integer
 */

// For-Each Iteration
/**
 * var arr = arrayOf(3, 5, 7, 9)
 * var x = 0
 * arr.forEach {
 * x += it-1
 * }
 * println(x)
 * For-Each iteration
 * Output: 20
 */

// Higher-Order Methods
/**
 * fun apply(x:Int, action: (Int) -> Int): Int {
 * return action(x)
 * }
 * Higher-order functions take another functions as method argument
 */

// Filter Method
/**
 * arr.filter({it%2 == 0})
 * Filter is a higher order function. In this example the filter filters all even numbers
 */

//--------------------------------------------------------------------------------------------------------------------//
// Section 4: OOP
//--------------------------------------------------------------------------------------------------------------------//

// Constructors via keyword
/**
 * class User {
 * var name = ""
 * var age = 0
 *
 * constructor (nm: String) {
 * name = nm
 * }
 *
 * constructor (nm: String, ag: Int) {
 * name = nm
 * age = ag
 * }
 * }
 * Multiple constructors via 'constructor' keyword
 */

// Getters & Setters
/**
 * class User {
 * var name = ""
 *
 * var age = 0
 * get() = field
 *
 * set(value) {
 * field = value
 * }
 *
 * The get() function defines how the age value is accessed. It simply returns the current value using the field keyword.
 * The set() function sets the provided value using the value keyword.
 */

// Class Functions
/**
 * class User(var name: String, var age: Int) {
 * fun login() {
 * println("Login from user " + name)
 * }
 * }
 *
 * fun main(args: Array<String>) {
 * var u = User("James", 42)
 * u.login()
 * }
 * Classes can have function parameters
 */

// Inheritance
/**
 * open class User(var name: String, var age: Int) {
 * }
 *
 * class Admin(name: String, age: Int): User(name, age) {
 * }
 *
 * class Moderator(name: String, age: Int): User(name, age) {
 * }
 * Both types of users (Admins and moderators) have a name and an age, so they inherit those properties from the user class
 */

// Abstract Functions
/**
 * override fun do() {
 * }
 */

