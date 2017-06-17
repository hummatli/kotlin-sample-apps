package challenges

import java.io.File

/**
 * Created by settar on 6/17/17.
 */

fun main(args: Array<String>) {
    val ipsToCount = mutableMapOf<String, Int>()

    File("src/ips.txt").forEachLine {
        var value = ipsToCount.putIfAbsent(it, 0)
        if (value != null) {
            value++
            ipsToCount.replace(it, value)
        }
    }

    var max: Pair<String, Int> = "" to 0
    ipsToCount.keys.forEach {
        if (ipsToCount.getValue(it) > max.second) {
            max = it to ipsToCount.getValue(it)
        }
    }

    println(max)
}