package classworks

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlin.properties.ObservableProperty

fun main(){

}

enum class DayOfWeek(val isWeekend: Boolean){
    MONDAY(false),
    TUESDAY(false),
    SUNDAY(true);

fun printDayType(){
    if(isWeekend) println("$name is a weekend")
    else println("")
}
}

enum class CoffeeType(val cost: Double, val coffeeBase: String, val recommendedSugar: Int, val hasMilk: Boolean = false) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0);

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."

    companion object {

        fun determine (coffeeBase: String): CoffeeType{
            return CoffeeType.entries.find{ it.coffeeBase == coffeeBase} ?: throw Exception("")
        }
    }
}

fun findCoofee( cheap: Boolean, hasMilk: Boolean): CoffeeType{
    return if(cheap){
        CoffeeType.entries.sortedBy { it.cost }.first{it.hasMilk == hasMilk}

    } else {
        CoffeeType.entries.sortedByDescending { it.cost }.first{it.hasMilk == hasMilk}
    }

}

//////// JSON

val gson = Gson()
val mdc1 = MyDataClass("First", 2)
val result = gson.toJson(mdc1)


data class MyDataClass(
    val property1: String,
    val property2: Int
)


val gson1 = GsonBuilder()
    .setPrettyPrinting()
    .create()
