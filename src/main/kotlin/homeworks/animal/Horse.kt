package homeworks.animal

class Horse(type: String, legs: Int, isAPet: Boolean) : Animal(type, legs, isAPet) {
    override fun makeSound() {
        print("Horrrww")
    }

    override fun showInfo() {
        print(" type: $type, legs: $legs, pet: $isAPet ")
    }
}