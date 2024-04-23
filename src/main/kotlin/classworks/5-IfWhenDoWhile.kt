package classworks

fun main(){
    for (i in 1..10){
        println(i + 1)
    }
}

fun example6() {
    for(i in 100 downTo 50 step 5){
        println(i)
    }
}

fun example9() {
    var result = 1
    var counter = 1
    do {
        result *= counter++
    } while (result <= 1000)
    println(counter - 2)
}

fun example13() {
    var counter = 1
    while (true) {
        if (counter % 7 == 0) break
        counter += 5
    }
    println(counter)
}

fun example14(arg: Int) {
    val range = 0..100

    for (i in range) {
        if (i == arg)
            break

        println(i)
    }
}

fun example15() {
    val range = 0..10

    for (i in range) {
        if (i == 3 || i == 7) continue
    }
}

fun example16() {
    val range = 20 downTo 1

    for (i in range) {
        if (i % 4 == 0) continue
        println(i)
    }
}

