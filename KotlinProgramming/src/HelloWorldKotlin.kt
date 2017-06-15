import javax.print.DocFlavor

/**
 * Created by settar on 6/14/17.
 */


fun main(args: Array<String>) {
    println("Hello World Kotlin from Sattar")

    //Variables -------------------------------------------
    var udemy = "Udemy"
    println(udemy)

    val pi = 3.14
    //pi = 3 // can not be reassagned
    println(pi)

    var myBoolean = 4<7
    println(myBoolean)

    //String consatinate--------------------------------------------
    var google: String = "Google"
    val myByte: Byte = 125
    println(google + " " + myByte)

    //Char data type---------------------------------
    val c: Char = 'd'
    println(c)

    //Data type transormation------------------------------------------
    var f2: Float = 4f
    var d2: Double = 5.5

    d2 = f2.toDouble()

    println(d2)

    //Expression and Stetments------------------------------------
    var s = println(1)
    println(s)

    var f3 = kotlin.Unit
    println(f3)


    //Nullable variables ---------------------------------------------
    //var str: String = null // Can not assigne
    var str1: String? = null
    println(str1) //We can call beacuse it does not give null

    //var l: Int = str1?.length // Because it returns nullable Int
    var l: Int? = str1?.length
    println("Nullabel Int = " + l) //Safe call.  length or null

    println("Length with Elviss operator =" + str1?.length ?:5)  // Safe call with Elviss operator. retuns length or 5

    if(str1 != null){
        str1.length // No need for safe call because it has checked
    }

    //str1!!.length // Twrowgs error. because Sure call has called

    var ss:String //Is correct
    val dd:String //Is correct
    dd = "" // Is correct

}