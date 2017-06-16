package challenges

/**
 * Created by settar on 6/15/17.
 * Class challenge created by me in Kotlin course
 */

class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {

    fun borrow(): Boolean {
        if (!borrowed) {
            borrowed = true
            return true
        } else {
            println("Sorry this book has already borrowed")
            return false
        }
    }

    fun returnedBook(): Boolean {
        if (borrowed) {
            borrowed = false
            return true
        } else {
            println("This book was not borrowed, So cannot be returned")
            return false
        }
    }

    fun print() {
        println("Book [Title: $title, Author: $author, Publication year: $publicationYear]")
    }
}

fun main(args: Array<String>) {
    val book = Book(title = "Rich Dad Poor Dad", author = "Kiyosaki", publicationYear = 1990, borrowed = false)
    book.returnedBook()
    book.borrow()
    book.borrow()
    book.returnedBook()
    book.print()
}

