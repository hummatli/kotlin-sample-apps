package oo

/**
 * Created by settar on 6/15/17.
 */

open class PersonInherited(open var name: String, open val age: Int) {

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth(): Int {
        return 2017 - age
    }

    open fun getYearOfBirthSimple() = 2017 - age

    open fun print() = println("Name = $name, Age = $age")
}

//Class not ovverirding properties
class Student1() : PersonInherited(name = "Ali", age = 4)

//Class overriding parameters
class Student2(override var name: String, override val age: Int) : PersonInherited(name, age)

//Class overriding parameters . I made age property mutabele declearing it as var dispite it was val in parent
class Student3(override var name: String, override var age: Int) : PersonInherited(age = age, name = name)

//Class overriding function .
class Student4(override var name: String = "Mamed", override var age: Int = 15) : PersonInherited(age = age, name = name) {
    override fun getYearOfBirthSimple() = super.getYearOfBirthSimple() + 10
}

//Class with additional properties and methods.
class Student5(override var name: String, override var age: Int, val studentId: Int) : PersonInherited(age = age, name = name) {

    fun isIntelligent() = true
    override fun print() = println("Name = $name, Age = $age, studentId = $studentId, isIntelligent = ${isIntelligent()}")
}

//Class Employee
class Employee(override var name: String, override var age: Int) : PersonInherited(name, age) {
    fun receivedPayment(){
        println("I received payment")
    }
}


fun main(args: Array<String>) {

    val student1 = Student1()
    student1.print()
    //student1.age = 5 // Cannot assigen cause it is immutable

    val student2 = Student2(age = 30, name = "Sattar")
    student2.print()
    //student2.age = 4 // Cannot assigen cause it is immutable

    val student3 = Student3("Tahir", 34)
    student3.print()
    student3.age = 50 // Now we can assigne cause i's mutable after override
    student3.print()

    val student4 = Student4()
    student4.print()
    println(student4.getYearOfBirthSimple())

    val  student5 = Student5("Zaur", 46, 25)
    student5.print()

    val employee = Employee("Səməd", 45)
    employee.print()
    employee.receivedPayment()

}
