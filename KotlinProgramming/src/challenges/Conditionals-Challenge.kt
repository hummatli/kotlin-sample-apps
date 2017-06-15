package challenges

import java.util.*

/**
 * Created by settar on 6/14/17.
 */
fun main(args: Array<String>) {

    val random = Random().nextInt(50) + 1

    when(random){
        in 1..10 -> println("In 1 to 10: $random")
        in 11..20 -> println("In 11 to 20: $random")
        in 21..30 -> println("In 21 to 30: $random")
        in 31..40 -> println("In 31 to 40: $random")
        else -> println("Over 40: $random")
    }
}