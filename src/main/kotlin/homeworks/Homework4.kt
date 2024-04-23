package homeworks

class Homework4 {


    fun seasonDetector(month: Int): String {

        return when (month) {
            12, 1, 2 -> "Зима"
            in 3..5 -> "Весна"
            in 6..8 -> "Лето"
            in 9..11 -> "Осень"

            else -> "Некорректный номер месяца"
        }
    }

    fun calculateDogAge(dogAge: Int): Double {
        if (dogAge > 20) {
            throw Exception("this is not a dog")
        }
        return when {
            dogAge < 0 -> 0.0
            dogAge <= 2 -> dogAge * 10.5
            else -> 2 * 10.5 + (dogAge - 2) * 4.0
        }
    }

    fun recommendTransport(routeLength: Int): String {
        return when {
            routeLength <= 1 -> "Пешком"
            routeLength <= 5 -> "Велосипед"
            else -> "Автотранспорт"
        }
    }


    fun calculateBonusPoints(purchaseAmount: Int): Int {
        return when {
            purchaseAmount <= 1000 -> (purchaseAmount / 100) * 2
            else -> (purchaseAmount / 100) * 5
        }
    }

    fun determineDocumentType(fileExtension: String): String {
        return when (fileExtension) {
            "txt", "doc", "docx" -> "Текстовый документ"
            "jpg", "png", "gif" -> "Изображение"
            "xls", "xlsx" -> "Таблица"
            else -> "Неизвестный тип"
        }
    }


    fun convertTemperature(value: Double, unit: String): String {
        return when (unit.uppercase()) {
            "C" -> "${value * 9 / 5 + 32} °F"
            "F" -> "${(value - 32) * 5 / 9} °C"
            else -> "Некорректная единица измерения"
        }
    }

    fun recommendClothing(temperature: Int): String {
        return when {

            temperature < 0 -> "Куртка и шапка"
            temperature in 0..15 -> "Ветровка"
            temperature < -30 || temperature > 35 -> "Не выходите из дома"
            else -> "Футболка и шорты"
        }
    }


    fun chooseMovieCategory(age: Int): String {
        return when {
            age <= 12 -> "Детские"
            age < 18 -> "Подростковые"
            else -> "18+"
        }
    }
}


