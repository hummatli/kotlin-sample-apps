package oo

/**
 * Created by settar on 6/16/17.
 */

abstract class Course(val topic: String, val price: Double){
    open fun learn(){
        println("Learning a $topic course")
    }
}

interface Learnable{
    fun learn(){
        println("Learning")
    }
}

//This has not default iimlementatin
interface Learnable2{
    fun learn()
}

//Due to ambiguity extend two method with the same name from class and interface needs to override it in Subclass
open class KotlinCourse : Course("Kotlin", 999.99), Learnable{
    final override fun learn() {
        super<Learnable>.learn()
        super<Course>.learn()
        println("I'm one of the first people learn Kotlin")
    }
}

//Here is any  ambiguity.Therfore there is no need to override learn method.  Interface has not default implementation of learn method
open class RubyCourse : Course("Ruby", 999.99), Learnable2

//There is no need to override learn in subclass. Cause it has already implemented in interface
class JavaClass : Learnable{

}

//This sub class may or not to override learn method
class PythonClass : Course("Pythn", 889.0)


//This subclass can not override leran method cause it is final
class SpecialKotlinClass() : KotlinCourse(){

}

fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()

}