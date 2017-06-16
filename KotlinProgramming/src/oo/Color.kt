package oo

/**
 * Created by settar on 6/16/17.
 */

enum class Color(val rgb: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun print(){
        println("This my RGB number $rgb")
    }

    fun containsRed(): Boolean{
        return this.rgb and 0xFF0000 != 0
    }
}


fun main(args: Array<String>) {
    Color.RED.print()

    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())


    println(true || true)

    //Bitwise  operators
    println(0b1101 and 0b1011) // 0b1001
    println(0b1101 or 0b1011)// 0b1111
    println(0b1101 xor 0b1011) // 0b0110

    //inverse
    //0b10011.inv() = 0b...01100
    println(0b10011.inv())
    println(0b10011.inv() and 0x0000001F)



}