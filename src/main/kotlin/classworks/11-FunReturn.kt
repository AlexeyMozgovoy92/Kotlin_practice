package classworks

fun main(){
    val res = printAll(12, "12" , "20", "df" )
    println(res)

    val res2 = concatenate("this", " is", " Kotlin")
    println(res2)
}



fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int): Int = a + b

fun applyOperaion(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun printAll(x: Int, vararg y: String) {
    println("$x, ${y.joinToString()}")
}

fun concatenate(vararg strings: String): String {
    val result = StringBuilder()
    for (string in strings) {
        result.append(string)
    }
    return result.toString()
}

infix fun Int.times(str: String) = str.repeat(this)


data class Point(val x: Int, val y: Int) {

    operator fun plus(p: Point): Point {
        return Point(x, y)
    }
}

class Calculator(private val word: String) {

    operator fun div(number: Int): List<String> {
        return listOf()
    }

    infix fun <T> replace(list: List<T>): List<String> {

        return listOf()
    }

    infix fun <K, V> wrapDictionary(map: Map<K,V>): Map<String, Map<K, V>> = mapOf(word to map)

    fun sendWord(email: String) = Unit

    private fun notToDo() = Unit

    fun <T> transform(function: (String) -> T): T {
        return function(word)
    }
}