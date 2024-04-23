package homeworks

class Homework19 {
}

fun main(){

    val returnIndx = fun (str: String, num: Int): String?{
        return str.split("").getOrNull(num)
    }

    val returnIndxL: (String, Int) -> String? = { s, num ->
        s.split("").getOrNull(num)
    }

    val returnIndxS = {str: String, num: Int ->
        str.split("").getOrNull(num)}


    println(returnIndx("Kotlin", 5))

    println(returnIndxL("Kotlin", 4))

    println(returnIndxS("Kotlin", 3))

    val stringReturnIndx = fun String.(num: Int): String?{
        return this.split("").getOrNull(num)
    }

    val stringReturnIndxL: String.(Int) -> String? = { num ->
        this.split("").getOrNull(num)

    }

    println("Kotlin".stringReturnIndx(2))
    println("Kotlin".stringReturnIndxL(1))

}

fun returnIndex (str: String, num: Int): String?{
    return str.split("").getOrNull(num)
}

fun String.returnIndex1(num: Int): String?{
    return this.split("").getOrNull(num)
}