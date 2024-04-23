
fun main() {

    val list1: List<String> = listOf("a", "b", "c")
    //println(list1.indexOf("a"))
    //println(list1.size)


    //    Задание 12: Поиск Элемента по Значению ----------------------------------------------
//    Создай словарь, где ключами будут пары. Через перебор найди ключ по второму значению пары

        val pairToKeyMap: Map<Pair<String, Int>, Int> = mapOf(
            Pair("one", 1) to 11,
            Pair("two", 2) to 22,
            Pair("three", 3) to 33
        )

        // второе значение для поиска
        val targetValue = pairToKeyMap.getValue(Pair("two", 2))


        for ((key, value) in pairToKeyMap) {
            if (value == targetValue) {
                println("$key")
            }
        }


}

