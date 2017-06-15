package functions

import java.util.*

/**
 * Created by settar on 6/15/17.
 */

//Functions -----------------------------
//No parameter, no return
fun helloWorld() {
    println("Hello World from Kotlin")
}

//One paramter, no return
fun printWithSpaces(text: String) {
    for (c in text) {
        print(c + " ")
    }
    println()
}

//No parameter, return Date
fun getCurrentDate(): Date {
    return Date()
}

//Two parameter, return Int
fun max(a: Int, b: Int): Int {
    if (a >= b) {
        return a
    } else {
        return b
    }
}


//Our main function
fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("I love Kotlin!")
    println("Current date : ${getCurrentDate()}")
    println("Max is ${max(30, 90)}")
}
