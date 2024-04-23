package classworks

class Classwork16 {
}

fun main(){

    val generate = fun (s: String, num: Int) : List<String> {
        return (1..num).map {s}
    }

    val generateS = {s: String, num: Int ->
        (1.. num ).map{s}

    }

    val generateString = fun String.(num: Int): List<String> {
        return (1..num).map {this}
    }

    val generateStringL : String.(Int) -> List<String> = {
        (1 .. it).map {this}
    }

    println(generateStringL("String", 3))
    println("Str".generateStringL(4))
    
    //println("String".generateList1(2))
    //println(generateList(true, 5))
   // println(generateS("something", 3))

    val generateL: (String, Int) -> List<String> = { s, num ->
        val range: IntRange = (1..num)
        val transform: (Int) -> String = { _ ->
            s
        }

        range.map{s}
    }

   // println(generateL("string", 6))





    val increment = fun (a: Int): Int{
        return a + 1
    }

    val incrementL: (Int) -> Int = {
        it + 1
    }

    val incrementS = { a: Int ->
        a + 1
    }

    println(increment(2))
}

fun generateList(s: String, num: Int) : List<String> {
    return (1..num).map {s}
}

fun String.generateList1(num: Int): List<String>{
    return (1..num).map {this}
}





fun increment(a: Int): Int{
    return a + 1
}

fun lambda(function: (Int) -> Int){
    println(function(5))
}

fun listGenerator(str: String, num: Int): List<String>{
    val list = mutableListOf<String>()
    for (l in 1..num ){
        list.add(str)
    }
    return list
}




