package homeworks

class Homework7 {
//    Задание 1: Создание Пустого Словаря
//    Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val emptyMap: Map<Int, Int> = emptyMap()

//    Задание 2: Создание и Инициализация Словаря
//    Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - строки, а значения - целые числа (например, "one" to 1, "two" to 2).

    val map2: Map<String, Int> = mapOf(
        "one" to 1,
        "two" to 2,

    )

//    Задание 3: Создание Изменяемого Словаря
//    Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val map3: MutableMap<Int, String> = mutableMapOf()


//    Задание 4: Добавление Элементов в Словарь
//    Имея изменяемый словарь, добавьте в него новую пару "ключ-значение".

    fun adding() {
        val map4: MutableMap<Int, String> = mutableMapOf()
        map4[1] = "one"
        map4[2] = "two"

        val valueKey = map4[2]
//contain key todo
        if (valueKey != null) {
            println("")
        } else {
            Exception("Отсутствует")
        }

        map4.replace(1, "one", "three")
        map4.remove(1)
    }

//    Задание 5: Получение Значений из Словаря
//    Используя словарь из предыдущего задания, извлеките значение, используя ключ. Обработайте случай с отсутствующим ключом.


//    Задание 6: Удаление Элементов из Словаря
//    Удалите определенный элемент из изменяемого словаря по его ключу.


//    Задание 7: Перебор Словаря в Цикле
//    Создайте словарь и используйте цикл для вывода всех его ключей и соответствующих значений.

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

//    Задание 8: Перезапись Элементов Словаря
//    Измените значение для существующего ключа в изменяемом словаре.

    fun replaceMap() {
        val map5: MutableMap<Int, String> = mutableMapOf(
            1 to "one",
            2 to "two"
        )

        map5.replace(1, "one", "three")
        map5[1] = "three"

    }
//    Задание 9: Сложение Двух Словарей
//    Создайте два словаря и объедините их в один (используйте putAll для изменяемых словарей).


    fun tqoDictionery() {

        val dict1: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3)
        val dict2: Map<String, Int> = mapOf("four" to 4, "five" to 5, "six" to 6)

        // Создаем изменяемый словарь и добавляем в него содержимое двух словарей
        val mergedDictionary: MutableMap<String, Int> = mutableMapOf()
        mergedDictionary.putAll(dict1)
        mergedDictionary.putAll(dict2)

    }


//    Задание 10: Словарь с Сложными Типами
//    Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.

    fun task10() {

        val map1: MutableMap<String, List<Int>> = mutableMapOf()
        map1["a"] = listOf(1, 2)




        val stringToListMap: MutableMap<String, List<Int>> = mutableMapOf()

        // Добавляем элементы в словарь
        stringToListMap["evenNumbers"] = listOf(2, 4, 6, 8, 10)
        stringToListMap["oddNumbers"] = listOf(1, 3, 5, 7, 9)


    }



//    Задание 11: Использование Множества в Качестве Значения
//    Создайте словарь, в котором ключи - это целые числа, а значения - множества строк. Добавьте данные в множества.

    fun task11() {
        // Создаем словарь с ключами типа Int и значениями типа MutableSet<String>
        val intToSetMap: MutableMap<Int, MutableSet<String>> = mutableMapOf()


        // Добавляем данные в множества
        intToSetMap[1] = mutableSetOf("apple", "banana", "cherry")


        // Добавляем элемент в существующее множество
        intToSetMap[1]?.add("strawberry")

    }



//    Задание 12: Поиск Элемента по Значению ----------------------------------------------
//    Создай словарь, где ключами будут пары. Через перебор найди ключ по второму значению пары
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



//    ======


//    Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
//    Задание 6: Словарь Библиотеки
//    Ключи - автор книги, значения - список книг

    val library: Map<Pair<String, String>, List<String>> = mapOf(
        Pair("Jack", "Black") to listOf("ABFoo", "NKYoo"),
        Pair("John", "Book") to listOf("ABFoo", "NKYoo"),
        Pair("June", "Brock") to listOf("ABFoo", "NKYoo"),
    )


//    Задание 12: Справочник Растений
//    Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val flowers: Map<String, List<String>> = mapOf(
        "flower" to listOf("ABFoo", "NKYoo"),
        "tree" to listOf("AMGoo", "JHYoo"),
        "bush" to listOf("ARToo", "DBFoo")
    )

//    Задание 8: Четвертьфинала
//    Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val teams: Map<String, List<String>> = mapOf(
        "Milan" to listOf("player1", "player2"),
        "Real" to listOf("player4", "player3"),
        "Keln" to listOf("player5", "player6")
    )



//    Задание 9: Курс лечения
//    Ключи - даты, значения - список препаратов принимаемых в дату

    val pharmacy: Map<Double, List<String>> = mapOf(
        10.01 to listOf("ABF", "NKY"),
        15.01 to listOf("AMG", "JHY"),
        20.01 to listOf("ART", "DBF")
    )



//    Задание 10: Словарь Путешественника
//    Ключи - страны, значения - списки городов с рекомендациями к посещению

    fun travaler() {
        val travelDictionary: Map<String, Pair<String, String>,> = mapOf(
            "USA" to Pair("Boston", "nice city"),
            "Italy" to Pair("Rome", "cool in fall"),
            "Germany" to Pair("Berlin", "great "),
        )

        println(travelDictionary)

//         Перебираем словарь путешественника
        for ((country, cities) in travelDictionary) {
            println("$country , $cities")
        }
    }
}