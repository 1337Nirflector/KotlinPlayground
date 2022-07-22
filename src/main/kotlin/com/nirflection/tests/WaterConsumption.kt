package com.nirflection.tests

// Problem
// Each day a family consumes 15 liters of water.
// Given the number of years as input, you need to calculate and output the amount of water consumed in that period.
//
// Sample Input
// 5
//
// Sample Output
// 27375
//
// The water consumption in 5 years would be: 5*365*15 = 27375

fun consumpt(args: Array<String>) {
    val years = readLine()!!.toInt()
    calc(years)
}

fun calc(years: Int) {
    val result = years * 365 * 15
    println(result)
}