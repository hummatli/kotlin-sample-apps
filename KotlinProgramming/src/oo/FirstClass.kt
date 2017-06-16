package oo

/**
 * Created by settar on 6/15/17.
 */

class House //Empty class

class Person(var name: String, val age:Int) {

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth(): Int {
        return 2017 - age
    }

    fun getYearOfBirthSimple() = 2017 - age
}

fun main(args: Array<String>) {
    val person = Person("Ali", 3)
    person.speak()
    person.greet("Kotlin World")

    println(person.getYearOfBirthSimple())

    println(person.name)
    println(person.age)

    person.name = "Peter"
    println(person.name)

    //Constructor called with named paramters
    val person1 = Person(age = 30, name = "Ali")
    println(person1.name)

}



