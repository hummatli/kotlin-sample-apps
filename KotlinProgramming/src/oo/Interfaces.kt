package oo

/**
 * Created by settar on 6/15/17.
 */

interface Driveable {
    fun drive()
    fun go(){
        println("I can go")
    }
}

interface Buildable {
    val timeRequared: Int // We can not initalize it here. Cause it's abstructdir. state ola bilmez
    fun build()
}

class Car(val color:String, override val timeRequared: Int = 120): Driveable, Buildable {
    override fun drive() {
        println("Driving car ...")
    }

    override fun build() {
        println("Build shin car")
    }
}


class MotorCycle(val  color:String): Driveable{
    override fun drive() {
        println("Driving MotorCycle ...")
    }
}


fun main(args: Array<String>) {

    //This is Polimorfizm
    val car:Driveable = Car("Red")
    car.drive()
    car.go()

    val motorcycle: Driveable = MotorCycle("Green")
    motorcycle.drive()
}