package loops

/**
 * Created by settar on 6/15/17.
 */

fun main(args: Array<String>) {

    //For loops ----------------------------------
    println("For loops ------------------------------")
    for (i in 1..10) {
        print("$i, ")
    }
    println()

    val list = listOf("Kotlin", "Java", "Python")
    for (element in list){
        print("$element  ")
    }
    println()

    for ((index, value) in list.withIndex()){
        println("Element at $index is $value")
    }

    //While loops ----------------------------------
    println("While loops ------------------------------")

    var x = 9
    while (x >= 0){
        print("$x, ")
        x--
    }
    println()

    var i = 1
    while (i <=10){
        print("$i, ")
        i++
    }
    println()


    //Continue Break  ----------------------------------
    println("Continue Break ------------------------------")

}