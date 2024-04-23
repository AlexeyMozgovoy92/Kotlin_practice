package classworks

class Parametrized {
    fun formatPhoneNumber(str: String): String? {
       val cleanedStr = str
           .replace("\\D".toRegex(), "")
           .replace("^[78]".toRegex(), "+7")
           //.replace("")

        if(cleanedStr.startsWith("+7") && cleanedStr.length == 12){
            val first = cleanedStr.substring(0, 2)
            val second = cleanedStr.substring(2, 5)
            val third = cleanedStr.substring(5, 8)
            val fourth = cleanedStr.substring(8, 10)
            val fifth = cleanedStr.substring(10)

            return "$first ($second) $third-$fourth-$fifth"
        }else return null

    }
}