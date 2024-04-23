package homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

class Homework22 {
}
fun main() {
    val instant = Instant.now()
    println(instant)

    val result = LocalDate.of(1950, 10, 10)
    println(identifyGeneration(result))

    println(example1.plusDays(10).format(formater))
    println(example2.plusDays(10).format(formater))

}


fun formatAnyDateByDate(temp: Temporal) {
    when (temp) {
        is LocalDate -> temp.format(DateTimeFormatter.ofPattern("yyyy,MM,dd"))
        is LocalTime -> temp.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is LocalDateTime -> temp.format(DateTimeFormatter.ofPattern("yyyy,MM,dd HH:mm:ss"))
        is ZonedDateTime -> temp.format(DateTimeFormatter.ofPattern("yyyy,MM,dd HH:mm:ss ZZZ z"))
        is OffsetDateTime -> temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        else -> temp.toString()
    }.also { println(it) }
}

fun formatAnyDateByIso(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_DATE_TIME)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        else -> temporal.toString()
    }.also { println(it) }
}

private val bumerStart = LocalDate.of(1945, 12, 31)
private val bumerEnd = LocalDate.of(1965, 1, 1)
private val zomerBefore = LocalDate.of(1996, 12, 31)
private val zomerAfter = LocalDate.of(2013, 1, 1)


fun identifyGeneration(birthday: LocalDate) {
    when {
        birthday.isAfter(bumerStart) && birthday.isBefore(bumerEnd) -> "Зумер"
        birthday.isAfter(zomerBefore) && birthday.isBefore(zomerAfter) -> "Бумер"
        //in bumerBefore..bumerAfter  -> "Зумер"

        //in zomerBefore.. zomerAfter -> "Бумер"
        else -> "Не определено"
    }.also { println(it) }
}


val example1 = LocalDate.of(2023, 2, 25)
val example2 = LocalDate.of(2024, 2, 25)

val formater = DateTimeFormatter.ofPattern("MM/dd")
