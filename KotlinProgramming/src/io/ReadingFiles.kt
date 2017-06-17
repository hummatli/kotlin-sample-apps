package io

import java.io.File

/**
 * Created by settar on 6/17/17.
 */


fun main(args: Array<String>) {

    var lineNumber = 0
    File("src/inputfile.txt").forEachLine {
        ++lineNumber
        println("#$lineNumber: $it")
    }
}