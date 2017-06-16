package oo

/**
 * Created by settar on 6/16/17.
 */

class Animal{
    var age: Int = 0
        //we are overriding default setter and getter
        //Field is waht stands behind propertis like in java
        get() = field
        set(value){
            if (value >= 0){
                field = value
            }
        }

    val name: String = "Sattar"
        get() = "My name is $field"
//        set(value){
//            we can not set it is val
//        }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.age = 8

    //-2 does not set caouse it is small than 0
    animal.age = -2

    println(animal.age)
    println(animal.name)
}