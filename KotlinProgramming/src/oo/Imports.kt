package oo

/**
 * Created by settar on 6/16/17.
 */

//I import here some method and objects
import functions.getCurrentDateSimple
import oo.CarFactory.produceCar
import oo.Color.BLUE

fun main(args: Array<String>) {

    //This has imported from functions package
    println(getCurrentDateSimple())

    //Method imported from Singleton
    produceCar()

    println(BLUE)
}