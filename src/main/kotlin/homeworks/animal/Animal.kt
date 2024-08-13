package homeworks.animal

open class Animal(protected val type: String, protected val legs: Int, protected val isAPet: Boolean = false) {


    open fun makeSound() {
        print("Sound")
    }

    open fun showInfo() {
        print("$type, $legs, $isAPet ")
    }
}