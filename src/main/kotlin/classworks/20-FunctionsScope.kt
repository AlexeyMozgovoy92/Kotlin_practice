package classworks

import java.io.File

class Classwork20 {
}

fun main() {
    val map = mutableMapOf<Int, Int>(1 to 2, 3 to 4)
    map.putIfAbsent(8, 9)


    val list = mutableListOf(1, 2, 3)

    // with
    with(list) {
        println(size)
        add(4)
    }

    // run
    val result = list.run {
        add(6)
    }

    //use  (use - closeable)
    File("example.txt").inputStream().use{
        val content = it.readBytes()
        println(content.size)
    }

    // apply
    val list3 = mutableListOf<String>().apply{
        add("first")
        add("second")
    }

//    return mutableListOf<Int>().apply {
//        add(1)
//        add(2)
//    }

    // also
    val list4 = mutableListOf<String>().also{
        it.add("first")
        it.add("second")
    }

  // let - обработка, проверка на null
val str: String? = "Hello"
val size = str?.let{
    println(str)
    it.length
}


fun m(arg: MutableList<String>) {
    with(arg) {
        add("4")
    }
}
}

