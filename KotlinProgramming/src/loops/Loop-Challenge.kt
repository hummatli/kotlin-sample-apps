package loops

/**
 * Created by settar on 6/15/17.
 *
 *
 * This is a Code Challenge for loops created by me on Kotlin course
 * Calculates the sum of all numbers from 100 to 100,000.
 */

fun main(args: Array<String>) {

    var sum = 0
    for (i in 100..100_000) {
        sum += i
    }

    println("Sum is $sum") // Result is 705077754
}