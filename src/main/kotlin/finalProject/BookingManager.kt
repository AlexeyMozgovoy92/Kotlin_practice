package finalProject

import java.time.LocalDateTime

interface BookingManager {

    fun createBooking(booking: Booking): String

    fun cancelBooking(bookingId: String)
    fun findBooking(roomId: String, startTime: LocalDateTime, endTime: LocalDateTime): List<Booking>

    fun isRoomAvailable(roomId: String, startTime: LocalDateTime, endTime: LocalDateTime): Boolean
}