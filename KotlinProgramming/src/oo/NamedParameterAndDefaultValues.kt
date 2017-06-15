package oo

/**
 * Created by settar on 6/15/17.
 */


class House2(val height: Double, val color: String, val price: Int = 5000) {

    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main(args: Array<String>) {
    val house = House2(4.5, "Green", 333333)
    val houseRed = House2(height = 4.9, color = "Red", price = 670_000)
    val houseBlack = House2(color = "Black", height = 3.9)

    house.print()
    houseRed.print()
    houseBlack.print()
}