package io

import java.io.File

/**
 * Created by settar on 6/17/17.
 */

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String, Int>()

    File("src/ips.txt").forEachLine {
        var value = ipToCount.put(it, 1)
        if (value != null) {
            value++
            ipToCount.put(it, value)
        }
    }

    var max: Pair<String, Int> = "" to 0
    ipToCount.keys.forEach {
        if (ipToCount.getValue(it) > max.second) {
            max = it to ipToCount.getValue(it)
        }
    }

    println(max)
}