package homeworks

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.Date

class DateTimeConverterTest {

    private val converter: DateTimeConverter  = DateTimeConverter()


    companion object{
        private val localDateToday = LocalDate.now()
        private val zeroTime = LocalTime.of(0, 0, 0)
        private val firstJan2024 = LocalDate.of(2024, 1, 1)
        @JvmStatic
        fun parameters() = listOf(
            Arguments.of("Сегодня", LocalDateTime.of(localDateToday, zeroTime)),
            Arguments.of("Вчера", LocalDateTime.of(localDateToday.minusDays(1), zeroTime)),
            Arguments.of("01:01", LocalDateTime.of(localDateToday, LocalTime.of(1,1,0))),
            Arguments.of("01:01:01", LocalDateTime.of(localDateToday, LocalTime.of(1,1,1))),
            Arguments.of("2024.01.01", LocalDateTime.of(firstJan2024, zeroTime)),
            Arguments.of("2024.01.01, 22:10", LocalDateTime.of(firstJan2024, LocalTime.of(22,10,0,0))),
            Arguments.of("2024.01.01, 22:10:15",LocalDateTime.of(firstJan2024, LocalTime.of(22,10,15))),
            Arguments.of("1 янв. 2024", LocalDateTime.of(firstJan2024, zeroTime)),
            Arguments.of("1 янв. 2024, 22:10", LocalDateTime.of(firstJan2024, LocalTime.of(22,10,0))),
            Arguments.of("1 янв. 2024, 22:10:15", LocalDateTime.of(firstJan2024, LocalTime.of(22,10,15))),

            )
        //"Сегодня" -> сегодняшняя дата, время 00:00
        //"Вчера" -> вчерашняя дата, время 00:00
        //"01:01" -> сегодняшняя дата, указанное время
        //"01:01:01" -> сегодняшняя дата, указанное время
        //"2024.01.01" -> указанная дата, время 00:00
        //"2024.01.01, 22:10" -> указанная дата и время
        //"2024.01.01, 22:10:15" -> указанная дата и время
        //"1 янв 2024" -> указанная дата, время 00:00
        //"1 янв 2024, 22:10" -> указанная дата и время
        //"1 янв 2024, 22:10:15" -> указанная дата и время

    }


    @ParameterizedTest
    @MethodSource("parameters")
    fun convertToDateTime(input: String, output: LocalDateTime) {
        Assertions.assertEquals(output, converter.convertToDateTime(input))
    }

    @Test
    fun shouldThrowException(){
        Assertions.assertThrows(IllegalArgumentException::class.java){
            converter.convertToDateTime("12.01.2024")
        }
    }
}