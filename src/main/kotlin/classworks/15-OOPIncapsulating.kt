package classworks

import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

fun main(){


}

class Account ( private var balance: Double) {

    fun deposite(amount: Double){
        if(amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

open class NewAccount ( private var balance: Double) {

    protected fun deposite(amount: Double){
        if(amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

class New(): NewAccount(10.5){
    fun example(){
        deposite(5.0)   // при Protected доступ только из класса наследника
    }
}

class SomeBook( private val author: String, private val bookName: String){

    fun getBookInfo(): String {
        return "$author, $bookName"
    }
}

class Lamp (){
    private var on: Boolean = false

    fun switchOn(){
        on = true
    }
}

abstract class LogPrinter(val level : String){
    private val formatter = DateTimeFormatter.ofPattern("YYYY-mm-dd HH:MM:ss.SSS")

    abstract fun log(message: String)
    protected fun time() : String{
    return formatter.format(ZonedDateTime.now())
    }

}

class InfoPrinter() : LogPrinter("info"){
    override fun log(message: String) {
        println("${time()}  $level : $message")
    }

}