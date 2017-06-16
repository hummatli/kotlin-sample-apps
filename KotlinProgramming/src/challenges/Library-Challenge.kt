package challenges

/**
 * Created by settar on 6/16/17.
 */

interface Lendable {
    fun borrow(): Boolean
    fun returnItem(): Boolean
}

abstract class InventoryItem(
        open val title: String,
        open val genre: String,
        open val publicationYear: Int,
        open var borrowed: Boolean = false) : Lendable {

    override fun borrow(): Boolean {
        if (!borrowed) {
            borrowed = true
            return true
        } else {
            println("This item has already borrowed")
            return false
        }
    }

    override fun returnItem(): Boolean {
        if (borrowed) {
            borrowed = false
            return true
        } else {
            println("This item was not borrowed, So cannot be returned")
            return false
        }
    }
}

data class LibraryBook(override val title: String,
                       override val genre: String,
                       val author: String,
                       override val publicationYear: Int) : InventoryItem(title, genre, publicationYear) {
    fun read() {
        println("Reading a book by $author")
    }
}

data class LibraryDVD(override val title: String,
                      override val genre: String,
                      val length: Int,
                      override val publicationYear: Int) : InventoryItem(title, genre, publicationYear) {
    fun watch() {
        println("Watching $title")
    }

}

fun main(args: Array<String>) {
    val book = LibraryBook(title = "Think and Rich", genre = "Self Development", author = "Napaleon Hill", publicationYear = 1980)
    book.borrow()
    book.borrow()
    book.returnItem()
    book.returnItem()

    val dvd = LibraryDVD(title = "I am legend", genre = "Feature", length = 12, publicationYear = 2013)
    dvd.borrow()
    dvd.borrow()
    dvd.returnItem()
    dvd.returnItem()

}