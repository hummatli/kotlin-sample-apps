package conditionals

/**
 * Created by settar on 6/14/17.
 */

fun main(args: Array<String>) {

    //If conditionals
    val age: Int = 16
    if (age < 18) {
        println("You cannot register")
    } else if (age < 20) {
        println("May be")
    } else {
        println("You're good to go")
    }
}