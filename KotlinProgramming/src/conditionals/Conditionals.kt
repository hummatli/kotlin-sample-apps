package conditionals

/**
 * Created by settar on 6/14/17.
 */

fun main(args: Array<String>) {

    //conditional statements with if -------------------------------------------------
    println("Conditional statement with if -------------------------")

    val age: Int = 16
    if (age < 18) {
        println("You cannot register")
    } else if (age < 20) {
        println("May be")
    } else {
        println("You're good to go")
    }

    //Conditional statements with when -------------------------------------------
    println("Conditional statement with when -------------------------")

    val mode: Int = 3
    when (mode) {
        1 -> println("The mode is lasy")
        2 -> {
            println("The mode is 2")
            println("Second mode")
        }
        3 -> println("Super mode")
        else -> println("I don't know what to do")
    }

    //conditional expression with if -------------------------------------------------
    println("Conditional expression with if ------------------")

    val age1: Int = 16
    val res = if (age1 < 18) {
        println("You cannot register")
        "My age is = " + age1
    } else if (age1 < 20) {
        println("May be")
        "My age is = " + age1
    } else {
        println("You're good to go")
        "My age is = " + age1
    }
    println("Result from if expression " + res)

    //Conditional expression with when -------------------------------------------
    println("Conditional expression with when -----------------------------------")

    val mode1: Int = 3
    val resultFromExpression = when (mode1) {
        1 -> "The mode is lasy"
        2 -> {
            println("The mode is 2")
            "Second mode"
        }
        3 -> {
            println("Before Super mode")
            "Super mode" // Expression unused
            "Super mode"
        }
        else -> "I don't know what to do"
    }

    println("Result from when expression = " + resultFromExpression)

}