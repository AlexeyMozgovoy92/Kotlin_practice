package finalProject

import java.time.LocalDateTime

class BookingManagerImpl : BookingManager {
    override fun createBooking(booking: Booking) {
        TODO("Not yet implemented")
    }

    override fun cancelBooking(bookingId: String) {
        TODO("Not yet implemented")
    }

    override fun findBooking(roomId: String, startTime: LocalDateTime, endTime: LocalDateTime): List<Booking> {
        TODO("Not yet implemented")
    }

    override fun isRoomAvailable(roomId: String, startTime: LocalDateTime, endTime: LocalDateTime): Boolean {
        TODO("Not yet implemented")
    }
}