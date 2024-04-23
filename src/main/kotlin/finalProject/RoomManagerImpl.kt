package finalProject

class RoomManagerImpl : RoomManager {

    private val rooms = mutableListOf<Room>()

    init {

    }

    override fun addRoom(room: Room) {
        TODO("Not yet implemented") // save to json
    }

    override fun removeRoom(roomId: String) {
        TODO("Not yet implemented")
    }

    override fun findRoom(capacity: Int, equipment: List<EquipmentType>): List<Room> {
        TODO("Not yet implemented")
    }


}