package oo

/**
 * Created by settar on 6/16/17.
 */

open class AnimalNew {
    private var age: Int = 0 //Can acces only from this class
    protected var name: String = "Sattar" //Can acces from sub class
    internal val isDagerous = true //Can Acsses from this module. Module is all project all packages - Kotlin programming
    public val publicProp = "I am public" // her yerden caqirmaq olar

    //Default da publicdir
    val publicPropDefault = "I am public default " // her yerden caqirmaq olar


    fun isOld(): Boolean {
        return age > 12
    }
}

class Cat : AnimalNew(){
    fun introduceYourName(){
        println("My name is $name")
    }
}

fun main(args: Array<String>) {
    val animal = AnimalNew()


}