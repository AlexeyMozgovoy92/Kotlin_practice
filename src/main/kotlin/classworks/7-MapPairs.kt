package classworks

fun task7() {
    val map5: Map<Int, String> = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )

    for ((key, value) in map5) {
        println("$key  $value")
    }
}

fun sercherSecoundPair() {
    val pairToKeyMap: Map<Pair<String, Int>, String> = mapOf(
        Pair("one", 1) to "first",
        Pair("two", 2) to "second",
        Pair("three", 3) to "third"
    )

    // второе значение для поиска
    val targetValue = pairToKeyMap.getValue(Pair("two", 2))
    println(targetValue)

    for ((key, value) in pairToKeyMap) {
        if (value == targetValue) {
            println("$key")
        }
    }
}