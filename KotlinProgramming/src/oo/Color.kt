package oo

/**
 * Created by settar on 6/16/17.
 */

enum class Color(val rgb: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

    fun print(){
        println("This my RGB number $rgb")
    }
}


fun main(args: Array<String>) {
    Color.RED.print()
}