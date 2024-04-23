package classworks

class Cw8Strings {
}

fun main(){
    val str = "   This is my email: dad@gmail.com   "
    val result = str.indexOf("@")
    val result1 = str.reversed()
    val result2 = str.substring(17, 21)
    val result3 = str.split("i")
    val result4 = str.trim()


    val result5 = str.contains("@")
    val result6 = str.isNullOrBlank()
    val result7 = str.isNullOrEmpty()


    println(result)

    checkMailDomain(str)
    getNameId()

}

fun checkMailDomain(str: String){
    val index = str.indexOf("@")
    val answer = str.substring(index + 1)
    println(answer)

}

// id [10] - name [Tom]
fun getNameId(){
    val str = "id [10] - name [Tom]"
    val res1 = str.indexOf("[")
    val res2 = str.indexOf("]")
    val answer1 = str.substring(res1 +1, res2)
    val res3 = str.lastIndexOf("[")
    val res4 = str.lastIndexOf("]")
    val answer2 = str.substring(res3 + 1, res4)
    println("His name : $answer2 , and Id: $answer1")

}