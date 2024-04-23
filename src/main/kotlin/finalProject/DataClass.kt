package finalProject

import java.time.LocalDateTime

data class Room(
    val roomId: String,
    val roomName: String,
    val capacity: Int,
    val listOfEquipment: List<Equipment>
)

data class Booking(
    val bookingId: String,
    val roomId: String,
    val employeeName: String,
    val startTime : LocalDateTime,
    val endTime: LocalDateTime
)

data class Equipment(
    val equipmentId: String,
    val title: String,
    val equipmentType: List<EquipmentType>
)

enum class EquipmentType {
    TABLE,
    CHAIR,
    TV,
    PROJECTOR,
    BOARD,
    AUDIOSYSTEM,
    INTERCOM;
}