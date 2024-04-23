package classworks

interface CerealStorage {
    val containerCapacity: Float
    val storageCapacity: Float

    fun addCereal(cereal: Cereal, amount: Float): Float
    fun getCereal(cereal: Cereal, amount: Float): Float
    fun removeContainer(cereal: Cereal): Boolean
    fun getAmount(cereal: Cereal): Float
}

interface Kitchen {
    fun selectCookware(amount: Float): Cookware
    fun measureWater(cereal: Cereal, amount: Float): Float
    fun cook(cookware: Cookware): Dish
}

class Cookware(private val capacity: Float) {

    private val composition = mutableMapOf<Cereal, Float>()
    private var water = 0f

    fun getCapacity(): Float = capacity

    fun addCereal(cereal: Cereal, amount: Float) {
        composition[cereal] = composition.getOrDefault(cereal, 0f) + amount
    }

    fun addWater(amount: Float) {
        water += amount
    }

    fun getWaterAmount(): Float = water

    fun getCerealsComposition(): Map<Cereal, Float> = composition.toMap()
}


data class Dish(
    val porridgeComposition: String,
    val portions: Int
)

class CerealCookFacade(private val cerealStorage: CerealStorage, private val kitchen: Kitchen) {

    fun cook(cereal: Cereal, amount: Float): Dish {
        TODO()
    }

    fun cook(composition: Map<Cereal, Float>): Dish {
        TODO()
    }

    fun buyCereal(cereal: Cereal, amount: Float) {
        TODO()
    }
}