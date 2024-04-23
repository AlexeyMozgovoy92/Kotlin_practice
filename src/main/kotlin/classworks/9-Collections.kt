package classworks

class Classwork9 {
}

fun main(){
    val listExample = mutableListOf(1, 2, 3, 4, 5)
    listExample.forEach{number ->
        println(number + 2)
    }
    println(listExample)

    val colors = listOf("Red", "Green", "Blue")

    colors.forEachIndexed { index, color ->
        println("Color at index $index is $color")
    }
}


fun mainwork() {

    val number = listOf(-1, 2, -3, 4, -5)

    val positiveNumbers = number.filter { it in -1..4 }
    val notPositiveNumber = number.filterNot { it > 0 }

    val firstPositive = number.firstOrNull { it > 0 }
    val elementOrElse = number.getOrElse(10) { -1 }
    val incrementedNumber = number.map { it + 1 }
    val incrementedNumber2: List<String> = number.map { "$it" } //преобразует в строку
    val numberSquareMap: Map<Int, Int> = number.associate { it to it * it }
    val multipleList: List<List<Int>> = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    val flattenList: List<Int> = multipleList.flatten() // склеить
    val flattenListMap = multipleList.flatMap { list ->  //склеить и преоразовать
        list.map { it * 2 }
    }
    val numberString = number.joinToString("")
    val sorter = number.sorted()
    val sorterNumberDescending = number.sortedDescending()
    number.forEach {
        println(it)
    }
    val sumOfNumber = number.sum()
    val averageNumb = number.average()
    val maxNumb = number.maxOrNull()
    val groupBy: Map<String, List<Int>> = number.groupBy { if (it > 0) "Positive" else " negative" }

    val distinctNumber = listOf(1, 2, 3, 4, 4).distinct() // уникальные занчение
    val number2 = listOf(1, 2, 3)
    println(number2.take(3))
    println(number2.takeLast(3))
    number.size
}

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 18..30) result.add(i)
    }
    return result
}


fun example() {
    val list = listOf(1, 2, 3, 4, null)
    list.filter { it in 5..10 }
    list.filterNotNull().filter { it % 2 != 0 || it % 3 != 0 }

    val stringList = listOf("first", "second")
    stringList.map { it.length  }
    stringList.associate { it to it.reversed() }
    val result10: Map<String, String> = stringList.associateBy { it.reversed() }
    stringList.sorted().sortedDescending()
    list.filterNotNull( ).forEach{ println(it * it) }
    stringList.groupBy { it[0] }
    stringList.distinct()
    list.take(5)
    list.takeLast(2)
}