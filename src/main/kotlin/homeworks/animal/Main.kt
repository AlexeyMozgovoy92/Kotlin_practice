package homeworks.animal

fun main() {

    val dog = Dog("home", 4, true)
    val cat = Cat("home", 4, true)
    val horse = Horse("wild", 4, false)

    val zoo: List<Animal> = listOf(dog, cat, horse)
    zoo.forEach {
        print(it::class.java.simpleName)
        it.showInfo()
        print(" Sound : ")
        it.makeSound()
        println()
    }

}