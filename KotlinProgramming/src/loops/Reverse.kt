package loops

/**
 * Created by settar on 6/15/17.
 */

fun main(args: Array<String>) {
    val numbers = listOf(12, 45, 2, 4, 3)
    println("Initial list ${numbers}")
    println("First reverse ${reverse(numbers)}")
    println("Second reverse ${reverse2(numbers)}")
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in 0..list.size - 1) {
        result.add(list[list.size - 1 - i])
    }
    return result
}

fun reverse2(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0){
        result.add(list[i])
    }
    return result
}