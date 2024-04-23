package homeworks

import java.util.*

//Создайте функцию, которая будет анализировать входящие фразы и применять к ним
// различные преобразования, делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
//Правила Проверки и Преобразования:
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".
//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
//Примеры Тестовых Фраз:
//"Это невозможно выполнить за один день."
//"Я не уверен в успехе этого проекта."
//"Произошла катастрофа на сервере."
//"Этот код работает без проблем."
//"Удача"

fun transformPhrase(phrase: String): String {
    return when {
        // Преобразование для "невозможно"
        phrase.contains("невозможно") -> phrase.replace(
            "невозможно",
            "совершенно точно возможно, просто требует времени",
            true
        )


        // Преобразование для "Я не уверен"
        phrase.startsWith("Я не уверен") -> "$phrase но моя интуиция говорит об обратном"

        // Преобразование для "катастрофа"
        phrase.contains("катастрофа") -> phrase.replace("катастрофа", "интересное событие", true)


    // Преобразование для "без проблем"
    phrase.endsWith("без проблем") -> phrase.replace("катастрофа", "с парой интересных вызовов на пути", true)
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
        !phrase.trim().contains(" ") -> "Иногда $phrase, но не всегда"

        else -> throw Exception("что-то")
    }
}



//Задания для substring
//Задание 1: Извлечение Даты из Строки Лога
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23". Извлеките дату и время из этой строки.

fun extractDateTimeFromLog(logString: String): String {
    val dateTimeStartIndex = logString.substring(32)
        return dateTimeStartIndex
}


//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".

fun maskCreditCard(cardNumber: String): String {
    val visibleDigits = 4
    val maskedDigits = cardNumber.length - visibleDigits

    return "*".repeat(maskedDigits) + cardNumber.substring(maskedDigits)
}

//Задание 3: Форматирование Адреса Электронной Почты
//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".

fun formatEmailAddress(email: String): String {
    val atIndex = email.indexOf('@')
    val dotIndex = email.lastIndexOf('.')

    return if (atIndex != -1 && dotIndex != -1 && dotIndex > atIndex) {
        val username = email.substring(0, atIndex)
        val domain = email.substring(atIndex + 1, dotIndex)
        val topLevelDomain = email.substring(dotIndex + 1)

        "$username [at] $domain [dot] $topLevelDomain"
    } else {
        email // Возвращаем оригинальный адрес, если формат не соответствует ожидаемому
    }
}

//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

fun extractFileName(filePath: String): String {
    val lastSlashIndex = filePath.lastIndexOf('/')
    val fileNameWithExtension = if (lastSlashIndex != -1 && lastSlashIndex < filePath.length - 1) {
        filePath.substring(lastSlashIndex + 1)
    } else {
        filePath
    }
    return fileNameWithExtension
}

//Задание 5: Создание Аббревиатуры из Фразы
//Описание: У вас есть фраза "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").

fun createAbbreviation(phrase: String): String {
    val words = phrase.split("-") // Разбиваем фразу на слова, учитывая возможные дефисы

    val abbreviation = words.map { it.first() }.joinToString("")

    return abbreviation
}

//Дополнительные задания
//Написать метод, который преобразует строку из нескольких слов в строку, где каждое
// слово начинается с заглавной буквы а все остальные - строчные.

fun capitalizeWords(input: String): String {
    return input.split(" ").joinToString(" ") { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
}

//Написать шифратор/дешифратор для строки. Шифровка производится путём замены двух соседних
// букв между собой: Kotlin шифруется в oKltni. Дешифровка выполняется аналогично. Если длина
// строки - нечётная, в конец добавляется символ пробела до начала шифрования. Таким образом все
// шифрованные сообщения будут с чётной длинной. Должно получиться два публичных метода: encrypt() и
// decrypt() которые принимают и возвращают строку.

class Cipher {
    fun encrypt(input: String): String {
        val paddedInput = if (input.length % 2 != 0) "$input " else input
        val encryptedChars = paddedInput.toCharArray()

        for (i in 0 until encryptedChars.size step 2) {
            val temp = encryptedChars[i]
            encryptedChars[i] = encryptedChars[i + 1]
            encryptedChars[i + 1] = temp
        }

        return String(encryptedChars)
    }

    fun decrypt(input: String): String {
        val decryptedChars = input.toCharArray()

        for (i in 0 until decryptedChars.size step 2) {
            val temp = decryptedChars[i]
            decryptedChars[i] = decryptedChars[i + 1]
            decryptedChars[i + 1] = temp
        }

        return String(decryptedChars)
    }
}