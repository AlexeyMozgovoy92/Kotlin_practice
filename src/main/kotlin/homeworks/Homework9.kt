package homeworks


fun main() {

    task6()

}

//Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.

fun task2() {
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)


    val sortedGrades = grades.filter { it >= 60 }
        .sorted()
        .take(3)

    println("$sortedGrades")
}

//Начальные значения: val list = listOf(
//"Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
// "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
// "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра",
// "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
// "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
//Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.

fun task3() {
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    val groupedCatalog = list.map { it.lowercase() }
        .groupBy { it[0]}

    groupedCatalog.forEach { (letter, items) ->
        println("$letter: ${items.joinToString()}")
    }
}

//Начальные значения из задачи 2.
//Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с двумя знаками после запятой.

fun task4() {
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    val avarageLengths = list.map { it.length }
        .average()

    println("%.2f".format(avarageLengths) )

}

// val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).

fun task5() {
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    numbers.distinct()
        .sortedDescending()
        .groupBy {
            if (it % 2 == 0) "четные" else "нечетные"
        }.forEach { (nonums, nums) ->
            println("$nonums ${nums.joinToString()}")
        }
}

//Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//Цель: Найти первый возраст в списке, который соответствует условию (больше 18) или вернуть сообщение "Подходящий возраст не найден".

fun task6() {
    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    val suitableAge = ages.filterNotNull().firstOrNull { it  > 18 }

    if (suitableAge != null) {
        println("Первый подходящий возраст: $suitableAge")
    } else {
        println("Подходящий возраст не найден")
    }


}



