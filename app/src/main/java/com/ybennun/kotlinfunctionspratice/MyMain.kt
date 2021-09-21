package com.ybennun.kotlinfunctionspratice

fun main() {
    println("I am inside Main Function")
    myFirstSimpleFunction()
    mySecondSimpleFunction()

    val day = dayOfWeek()
    println("My favorite day of week is: $day")

    val number1 = 5
    val number2 = 18

    val result = sum(number1, number2)

    println("The result of $number1 + $number2 is: $result")
}

fun myFirstSimpleFunction() {
    println("I am inside myFirstSimpleFunction")
}

fun mySecondSimpleFunction() {
    for (i in 1..10) {
        println("number = $i")
    }
}

fun dayOfWeek(): String {
    val arrayOfDays = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return arrayOfDays[(0..6).random()]
}

fun sum(number1: Int, number2: Int) = number1 + number2
