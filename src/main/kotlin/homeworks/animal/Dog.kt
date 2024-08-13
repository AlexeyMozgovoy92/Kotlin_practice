package homeworks.animal

class Dog(type: String, legs: Int, isAPet: Boolean) : Animal(type, legs, isAPet){

    override fun makeSound(){
        print("Bark")
    }

    override fun showInfo() {
        print(" type: $type, legs: $legs, pet: $isAPet ")
    }

}