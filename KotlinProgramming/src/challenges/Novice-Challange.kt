package challenges

/**
 * Created by settar on 6/15/17.
 *
 * Novice challange  - class work for me on course Kotlin
 * Creates a list of book titles, loops over it and, if the title contains 'e', prints each char of the title in a line.
 */

fun main(args: Array<String>) {

    val books = arrayListOf(
            "Rich Dad Poor Dad",
            "Think & Grow Rich",
            "The 4-Hour Workweek",
            "Ubuntu",
            "Her Şey Seninle Başlar")

    for (bookName in books){
        if (bookName.contains('e')){
            println("Chars for book \"$bookName\" are following:")
            for (c in bookName){
                println(c)
            }
            println()
        }
    }
}