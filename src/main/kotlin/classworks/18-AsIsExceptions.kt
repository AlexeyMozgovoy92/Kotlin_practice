package classworks

import java.lang.ClassCastException

fun main() {

    val num: Any = 123
    val safeStr: String? = num as? String
    println(safeStr)

    val x: String? = null
    println(x!!)
    val array: Array<Int> = arrayOf(1, 2, 3, 4)


    val mixedList: List<Any> = listOf("kotlin", 123, 3.45)
    for (item in mixedList)
        when (item) {
            is String -> println("")
        }


    class Classwork15 {
    }

    fun check(obj: Any) {
        if (obj is String)
            println("String")
        if (obj !is String)
            println("not string")
    }

    fun analyzeDataType(a: Any) {
        when (a) {
            is String -> println("строка $a")
            is Int -> println("квадрат числа равен ${a.times(a)}")
            else -> println(a.toString())
        }
    }

    fun printSringLenght(a: Any) {
        try{
            println((a as String).length)
        } catch (e: ClassCastException){
            println("not possible")
        }
    }
}