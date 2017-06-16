package oo

/**
 * Created by settar on 6/16/17.
 */

//Java Bean methods needs to be implemented
class Book(val title: String, val author: String, val publicationYear: Int, var price: Double)

//All Java Bean methods has implemented
data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double)

//Data class can have custom method too
data class DataBook2(val title: String, val author: String, val publicationYear: Int, var price: Double){
    fun print(){
        println("Custom method of data class")
    }
}

//Data class can not be abstract
//abstract data class DataBook3(val title: String, val author: String, val publicationYear: Int, var price: Double)

fun main(args: Array<String>) {
    val book = Book("Rich Dad Poor Dad", "Kiyossaki", 1997, 34.0)
    val book2 = Book("Rich Dad Poor Dad", "Kiyossaki", 1997, 34.0)

    val dataBook = DataBook("Rich Dad Poor Dad", "Kiyossaki", 1997, 34.0)
    val dataBook2 = DataBook("Rich Dad Poor Dad", "Kiyossaki", 1997, 34.0)
    val dataBook3 = dataBook.copy(price = 45.0)

    //valuse assigned besed on order not on name
    val (title, author, publicationYear, price) = dataBook

    val (title2, publicationYear2, author2, price2) = dataBook

    println(book)
    println(dataBook)
    println(dataBook3)

    println(title)
    println(author)
    println(publicationYear2) // This is author. Will represent author cause it is in the place of author in data class

    println(book == book2)
    println(dataBook.equals(dataBook2))
    println(dataBook == dataBook2)


    val set = hashSetOf(dataBook, dataBook2, dataBook3)
    println(set) //Due to there are two equal dataObject this function taes only one of it. There are can not be dublicate elements in set

}