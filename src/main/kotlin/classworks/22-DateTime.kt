package classworks

import java.time.*
import java.time.format.DateTimeFormatter

class Classwork22 {
}

fun main(){

    val instant = Instant.now()
    val dataTimeNow = LocalDate.now()
    val birthday = LocalDate.of(1983,10,2)
    val localTimeNow = LocalTime.now()
    val endOfWorkingDay = LocalTime.of(18,0,0)
    val localDateTime = LocalDateTime.now()
    val alarmClock = LocalDateTime.of(2024, 4, 1, 9, 0, 0)
    val dateTime = LocalDateTime.of(dataTimeNow, endOfWorkingDay)

    val birthdayInDybai = OffsetDateTime.of(birthday.atTime(19, 0), ZoneOffset.of("+09:00"))


    val lastFallDay = LocalDate.of(2025, 5, 30)
    val lastSummerDay = LocalDate.of(2025, 8, 30)

    val period = Period.between(lastFallDay, lastSummerDay)
    println(period)
    val period2 = Period.of(2018, 4, 23)
    val formater = DateTimeFormatter.ofPattern("yyyy/MM/dd")

    println(lastFallDay.plus(period2).format(formater))
    //  Period.between( )
 //  Duration()
    println(instant)
    val date = ZonedDateTime.of(2024, 4, 1, 4, 1, 0, 0, ZoneId.of("Europe/Moscow"))
    println(date)


}



