package homeworks

fun main() {


//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.

    val testData: Map<String, Int> = mapOf(
        "test1" to 2,
        "test3" to 4,
        "test5" to 9
    )
    val averageResult = testData.values.average()


//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.

    val autoTests: Map<String, String> = mapOf(
        "test1" to "testdata",
        "test2" to "testdata2"
    )
    for ((key, value) in autoTests) {
        println("Key: $key")
    }
}
//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

//Посчитайте количество успешных тестов в словаре с результатами.

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации), получите значение для "browserType". Ответ не может быть null.

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства), получите настройки для конкретной модели или верните настройки по умолчанию.
//
//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.



