package homeworks

fun main(){
    getStringLengthOrZero(15)
    sumIntOrDoubleValues(mixList)
    sumIntOrDoubleValues(listOf(1, 2, 3, 4))

}

class Homework15 {
}




//TASK 2

fun getStringLengthOrZero(obj: Any?) {
    if (obj is String)
        println("This is a string with lenght: ${obj.length}")
    if (obj !is String || obj == null)
        println("0")
}


// TASK 3
val mixList: List<Int> = listOf(1, 2, 3)

fun sumIntOrDoubleValues(l: List<Any>): Double {
    return l.sumOf {
        when (it) {
            is Int -> it.toDouble()
            is Double -> it
            else -> 0.0
        }
    }
}

//TASK 4

fun tryCastToListAndPrint(input: Any) {
    val list = input as? List<*>
    if (list == null) {
        println("Ошибка: аргумент не является списком")
        return
    }
    list.forEach {
        if (it is String) {
            println(it)
        } else {
            println("Предупреждение: элемент '$it' не является строкой")
        }
    }
}

