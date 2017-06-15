package challenges

/**
 * Created by settar on 6/15/17.
 * Class challenge created by me in Kotlin course
 */

class Book {
    var title: String = "Rich Dad Poor Dad"
    var author: String = "Kiyosaki"
    var publicatioYear = 1990
    var borrowed: Boolean = false

    fun borrowedFromMe(){
        borrowed = true
    }

    fun returnedToMe(){
        borrowed = false
    }

    fun print(){
        println("Title: $title, Author: $author, Publication year: $publicatioYear ")
    }
}

fun main(args: Array<String>) {
    val book = Book()
    book.print()
}

