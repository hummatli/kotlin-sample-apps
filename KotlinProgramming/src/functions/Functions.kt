package functions

import java.util.*

/**
 * Created by settar on 6/15/17.
 */

val  ss = "" //Variables can be decleared in file
var  sss = "" //

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

//simple function
fun getCurrentDateSimple() = Date()

//simple function
fun simpleFunc(text: String) = println(text)

//Two parameter, return Int
fun max(a: Int, b: Int): Int {
    if (a >= b) {
        return a
    } else {
        return b
    }
}

//Function with default values
fun sampleFunWithDefaultVal(a: Int, b: Int = 45, c: Int = 13){
    println("a = $a, b = $b, c = $c")
}


//Our main function
fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("I love Kotlin!")
    println("Current date : ${getCurrentDate()}")
    println("Current date simple : ${getCurrentDateSimple()}")
    println("Max is ${max(30, 90)}")
    simpleFunc("It's from simple function")


    //Called with amed paramteres
    println("Max is ${max(b=30, a=90)}")

    //Calling function with default val
    sampleFunWithDefaultVal(3)
    sampleFunWithDefaultVal(b = 22, a = 90)
    sampleFunWithDefaultVal(a = 7)
    sampleFunWithDefaultVal(5, c = 46)

}
