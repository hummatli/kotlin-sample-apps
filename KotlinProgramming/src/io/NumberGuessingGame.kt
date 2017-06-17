package io

import java.util.*

/**
 * Created by settar on 6/17/17.
 */

fun main(args: Array<String>) {
    val number = Random().nextInt(100) + 1
    var input: String?
    var guess: Int = -1

    while (guess != number) {
        print("Guess a number between 1 and 100: ")
        input = readLine()

        if (input != null) {
            //can through NumberFormatExeption
            guess = input.toInt()
        }

        if (guess < number) {
            println("Too small")
        } else if (guess > number) {
            println("Too large")
        } else {
            println("You won!")
        }
    }
}
