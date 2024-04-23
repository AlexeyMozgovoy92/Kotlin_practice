package finalProject

interface RoomManager {

    fun addRoom(room: Room)

    fun removeRoom(roomId: String)
    fun findRoom(capacity: Int, equipment: List<EquipmentType>): List<Room>
}