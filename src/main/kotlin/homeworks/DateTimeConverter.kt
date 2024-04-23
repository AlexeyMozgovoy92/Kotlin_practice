package homeworks

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*


fun main(){
   // 1 янв 2024, 22:10:15

    val result = DateTimeFormatter.ofPattern("d MMM yyyy, HH:mm", Locale.forLanguageTag("ru-RU"))
    val dateTime = LocalDateTime.now()
    println(dateTime.format(result))
}

class DateTimeConverter {

    private val dayToday = LocalDate.now()
    private val dayYesterday = LocalDate.now().minusDays(1)
    private val zeroTime = LocalTime.of(0, 0)

    private val timeformat = DateTimeFormatter.ofPattern("HH:mm")
    private val timeFormatterWithSeconds = DateTimeFormatter.ofPattern("HH:mm:ss")
    private val dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd")
    private val dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm")
    private val dateTimeFormatterWithSeconds = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss")
    private val dateFormatter2 = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.forLanguageTag("ru-RU"))
    private val dateTimeFormatter2 = DateTimeFormatter.ofPattern("d MMM yyyy, HH:mm", Locale.forLanguageTag("ru-RU"))
    private val dateTimeFormatterWithSeconds2 = DateTimeFormatter.ofPattern("d MMM yyyy, HH:mm:ss", Locale.forLanguageTag("ru-RU"))



    fun convertToDateTime(input: String): LocalDateTime {
        return when {
            input.equals("Сегодня", true) -> LocalDateTime.of(dayToday, zeroTime)
            input.equals("Вчера", true) -> LocalDateTime.of(dayYesterday, zeroTime)
            else -> tryParse(input)
        }
    }

    private fun tryParse(text: String): LocalDateTime {
        val timeFormatters = listOf(
            timeformat,
            timeFormatterWithSeconds
        )

        val dateFormatters = listOf(
            dateFormatter,
            dateFormatter2
        )
        val dateTimeFormatters = listOf(
            dateTimeFormatter,
            dateTimeFormatterWithSeconds,
            dateTimeFormatter2,
            dateTimeFormatterWithSeconds2
        )

        val timeParserFunction = { formatter: DateTimeFormatter ->
            val time = LocalTime.parse(text, formatter)
            LocalDateTime.of(dayToday, time)
        }

        val dateParserFunction = { formatter: DateTimeFormatter ->
            val date = LocalDate.parse(text, formatter)
            LocalDateTime.of(date, zeroTime)
        }

        val dateTimeParserFunction = { formatter: DateTimeFormatter ->
            LocalDateTime.parse(text, formatter)
        }

        val formatters = mapOf(
            timeFormatters to timeParserFunction,
            dateFormatters to dateParserFunction,
            dateTimeFormatters to dateTimeParserFunction
        )

        formatters.forEach { (formatters, parser) ->
            formatters.forEach { formatter ->
                try {
                    return parser(formatter)
                } catch (ignored: Throwable) {
                    // do nothing
                }
            }
        }


        throw IllegalArgumentException("Не удалось преобразовать в дату строку $text")
    }



}