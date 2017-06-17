package io

import java.io.File

/**
 * Created by settar on 6/17/17.
 */

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String, Int>()

    File("src/ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }

    //Simple case -------------------------
    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!

    //Large case------------------------
//    var maxIp = ipToCount.keys.first()
//    var maxCount = 0
//    for((ip, count) in ipToCount.entries){
//        if (count > maxCount) {
//            maxCount = count
//            maxIp = ip
//        }
//    }

    println("Most frequently used ip is $maxIp wih count $maxCount")
}