package oo

/**
 * Created by settar on 6/15/17.
 */

abstract class PersonAbstract(open var name: String, open val age: Int) {

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth(): Int {
        return 2017 - age
    }

    open fun getYearOfBirthSimple() = 2017 - age

    open fun print() = println("Name = $name, Age = $age")
}


//Class with additional properties and methods.
class Student6(override var name: String, override var age: Int, val studentId: Int = 16) : PersonAbstract(age = age, name = name) {

    fun isIntelligent() = true
    override fun print() = println("Name = $name, Age = $age, studentId = $studentId, isIntelligent = ${isIntelligent()}")
    override fun speak() = println("Hi I'm student")
}

//Class Employee
class Employee2(override var name: String, override var age: Int) : PersonAbstract(name, age) {
    fun receivedPayment(){
        println("I received payment")
    }

    override fun speak() = println("Hi I'm employee")

}


fun main(args: Array<String>) {

    val student6 = Student6("Sattar", 30)
    student6.speak()

    val employee2 = Employee2("Mamed", 45)
    employee2.speak()

}
