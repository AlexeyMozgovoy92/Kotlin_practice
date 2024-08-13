package homeworks.animal

class Cat(type: String, legs: Int, isAPet: Boolean) : Animal(type, legs, isAPet) {

    override fun makeSound() {
        print("Maow")
    }

    override fun showInfo() {
        print(" type: $type, legs: $legs, pet: $isAPet ")
    }
}