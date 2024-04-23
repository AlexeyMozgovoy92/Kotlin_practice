package classworks

fun classwork() {
    val fruits = mapOf("apple" to 2.99, "banana" to 3.99)

    for (entry in fruits.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }
    for ((key, value) in fruits) {
        println("Key: $key, Value: $value")
    }
    fruits.entries
    fruits.keys
    fruits.values

    val priceOrElse = fruits.getOrElse("pear") { 0.0 } // установит значение 0,0 если ничего нет
    val priceOfApple = fruits.getValue("apple")
    val priceOrDefault = fruits.getOrDefault("pear", 0.0)
    val fruitWithoutApple = fruits - listOf("apple")
    val mutableFruits = fruits.toMutableMap()
    mutableFruits.putAll(mapOf("lime" to 3.5))
    mutableFruits.remove("kiwi")
    mutableFruits.clear()
    val resutl = mutableFruits.count() // how many
    val res3 = mutableFruits.filterNot { it.key == " apple" }
    val fruitMap = fruits.map { "${it.key} cost ${it.value}" }

}