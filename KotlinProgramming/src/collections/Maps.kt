package collections

/**
 * Created by settar on 6/17/17.
 */


fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Sattar", 30), Pair("Peter", 24))
    val namesToAges2 = mapOf(
            "Sattar" to 30,
            "Peter" to 24)

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)
    println(namesToAges)

    val countryInhabitats = mutableMapOf(
            "USA" to 300_000_000,
            "Azerbaijan" to 8_000_000
    )
    countryInhabitats.put("Turkey",76_000_000)
    countryInhabitats.putIfAbsent("USA", 320_000_000)

    println(countryInhabitats)


    println(countryInhabitats.contains("Azerbaijan"))
    println(countryInhabitats.containsKey("Azerbaijan"))
    println(countryInhabitats.containsValue(8_000_000))

    println(countryInhabitats.get("Azerbaijan"))
    println(countryInhabitats.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }

}