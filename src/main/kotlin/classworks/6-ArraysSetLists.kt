package classworks



fun main(){
    val array2: Array<Int?> = arrayOfNulls(10)
    for (i in array2.indices){
        array2[i] = i + 1
    }
    println(array2.joinToString(" ,"))



    val list: MutableList<Int> = mutableListOf(1, 2)
    list[1] = 4
    list.addAll(listOf(4, 5, 6, 7))
    println(list.toString())
    list.removeAt(5)
    println(list.filter { it > 3 })


}



class Homework6 {

    fun trymain(args: Array<String>) {

        val array: Array<String> = arrayOf("1", "2", "3")
        array[0] = "1"

        println(array[0])

        val list: MutableList<Int> = mutableListOf(1, 2)
        list[1] = 4
        list.addAll(listOf(4, 5, 6, 7))
        list.removeAt(5)
        println(list.filter { it > 5 })

        println(list.size)

        val set: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)
        set.remove(1)

        val result = set.filter { it % 2 ==0 } //выводит только четные

        println(result.joinToString(", "))

        val arrayEmpty: Array<Int> = arrayOf(1, 2, 3 )

        for(i in arrayEmpty.indices){
            arrayEmpty[i] = 0
        }

        println(arrayEmpty.joinToString(" ,"))

        val array6 = arrayOf(1, 2, 3, 4, 5, 6)
        val array7: Array<Int> = arrayOf(3, 2, 1)

        val copy = arrayCopy(array6, array7)
        println(copy.toList())

        //List
        val list1: MutableList<String> = mutableListOf("ar", "B", "sf")

        val litov = findB(list1)

        println(litov)

    }
    //поиск по list
    fun findB(list: List<String>): Boolean {
        for(i in list) {
            if(i =="B") return true
        }
        return false
    }

    fun arrayCopy(ar: Array<Int>, ar2: Array<Int>) : Array<Int> {
        if (ar.size > ar2.size) {
            for (i in ar2.indices) {
                ar[i] = ar2[i]
            }
            return ar
        } else {
            for (i in ar.indices) {
                ar2[i] = ar[i]
            }
            return ar2
        }

    }
}