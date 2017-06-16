package oo

/**
 * Created by settar on 6/16/17.
 */

object Cache {

    val name = "HyperCaher"

    fun retrieveData(): Int {
        return 0
    }
}

fun main(args: Array<String>) {

    println("This is SingleTone name  = ${Cache.name}")
    println("This is SingleTone method cal  = ${Cache.retrieveData()}")
}