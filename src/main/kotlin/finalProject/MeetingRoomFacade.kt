package finalProject

import java.time.LocalDateTime

class MeetingRoomFacade (
    private val roomManager: RoomManager,
    private val bookingManager: BookingManager,
    private val stockManager: StockManager
)

{
    fun addEquipmentToStock(equipment: Equipment) {
        stockManager.addEquipment(equipment)
    }

    fun removeEquipmentFromStock(equipmentId: String) {
        stockManager.removeEquipment(equipmentId)
    }

    fun moveEquipmentToRoom(equipmentId: String, roomId: String) {
        stockManager.moveEquipmentToRoom(equipmentId, roomId)
    }

    fun findAvailableRoom(capacity: Int, equipment: List<EquipmentType>, startTime: LocalDateTime, endTime: LocalDateTime): Room? {
        val availableRooms = roomManager.findRoom(capacity, equipment)
        for (room in availableRooms) {
            if (bookingManager.isRoomAvailable(room.roomId, startTime, endTime)) {
                return room
            }
        }
        return null // TO DO
    }

    fun bookRoom(roomId: String, employeeName: String, startTime: LocalDateTime, endTime: LocalDateTime): String {
        val booking = Booking("123", roomId, employeeName, startTime, endTime)

        return bookingManager.createBooking(booking)
    }

    fun cancelBooking(bookingId: String) {
        bookingManager.cancelBooking(bookingId)
    }
}
