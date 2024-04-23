package classworks



class Classwork14 {


}
fun main(){
    val item:Double = 1000563565.65565
    println(item.format())

    val pair1 = Pair("STR", 10)
    println(pair1.revert())
}

fun Double.format(): String {
    return "%,.2f".format(this)
}

fun String.calculateWords(): Int{
    return this.split("").count{it.isNotBlank()}
}

//task 1
fun Pair<String, Int>.revert(): Pair<Int, String>{
    return second to first
}

// task 4
fun String.getPhoneNumber(): String? {
    val phoneRegex = Regex("""(\+7|8)[\s-]?\(?\d{3}\)?[\s-]?\d{3}[\s-]?\d{2}[\s-]?\d{2}""")
    val matchResult = phoneRegex.find(this)
    return matchResult?.value
}