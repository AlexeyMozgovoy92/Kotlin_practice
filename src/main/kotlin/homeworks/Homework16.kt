package homeworks

class Homework13 {
}

interface TurnOn{
    fun pushTheButton()
}

interface Sound{
    fun on (amount: Int)
}
interface Power{
    val totalPercentage: Int
    fun battery(percetage: Int)
}

interface Light{
    val color: String
}
interface Clean{}




abstract class Soundbar: TurnOn, Sound, Power

abstract class Oven() : TurnOn, Sound, Light, Clean {
}

