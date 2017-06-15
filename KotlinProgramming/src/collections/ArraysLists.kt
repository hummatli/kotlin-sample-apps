package collections

/**
 * Created by settar on 6/14/17.
 */

fun main(args: Array<String>) {

    //Arrays----------------------------------------
    println("Arrays --------------------")
    val array = arrayOf("Texas", "NewYork", "Colifornia")
    val mixed = arrayOf("Kotlin", 17, false, 5.9)
    val numbers = intArrayOf(18, 29, 22)
    println(mixed[0])

    val myName = "Sattar"
    println("My name's third letter is " + myName[2])

    val states2 = arrayOf("Nevada", "Iowa")
    val allStates = array + states2
    println("All states size = " + allStates.size)

    val empty = mixed.isEmpty()
    println("Mixed is $empty")

    if (allStates.contains("Arizona")){
        println("Contains Arizona")
    }else{
        println("Does not contain Arizona")
    }

    array.withIndex() //Expression

    //Lists----------------------------------------
    println("Lists --------------------")
    val arrayList = arrayListOf("Ali", "Nargiz", "Sattar")
    val list = listOf("Apple", "Nar", "Heyva")

    println(arrayList.size)
    println(arrayList[1])
    println(arrayList + list)


    arrayList.add("Murad")
    arrayList.add(3, "Sebine")

    println(arrayList)
    arrayList.remove("Sebine")
    println(arrayList)

    val subList = arrayList.subList(0,3)
    println(subList)







}
