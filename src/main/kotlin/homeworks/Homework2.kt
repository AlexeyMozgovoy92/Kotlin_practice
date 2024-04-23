package homeworks

class Homework2 {}


fun main1() {
    val initialIntensity = 100.0 // Ваше измеренное значение начальной интенсивности звука
    val calculatedIntensity = calculateSoundIntensity(initialIntensity)

    println("Предполагаемая интенсивность звука после затухания: $calculatedIntensity")
}

fun calculateSoundIntensity(initialIntensity: Double, attenuationCoefficient: Double? = null): Double {
    val attenuation = attenuationCoefficient ?: 0.5
    return initialIntensity * attenuation
}


fun calculateTotalShippingCost(cargoValue: Double? = null): Double {
    val standardCargoValue = 50.0
    val insuranceRate = 0.005

    val actualCargoValue = cargoValue ?: standardCargoValue
    val insuranceCost = actualCargoValue * insuranceRate

    return actualCargoValue + insuranceCost
}

fun main2() {
    // Пример использования
    val cargoValue = 100.0 // Укажите стоимость груза (если не указана, будет использована стандартная стоимость)
    val totalShippingCost = calculateTotalShippingCost(cargoValue)

    println("Полная стоимость доставки: $totalShippingCost")
}







fun processAtmosphericPressure(pressure: Double? = null): Comparable<*> {
    val pressureData = pressure ?: throw Exception("Ошибка: Показания атмосферного давления отсутствуют.")

    return pressureData
}



