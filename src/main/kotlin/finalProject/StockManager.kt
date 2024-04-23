package finalProject

interface StockManager {

    fun addEquipment(equipment: Equipment)
    fun removeEquipment(equipmentId: String)
    fun findEquipmentByType(type: EquipmentType): List<Equipment>
    fun findEquipmentByName(name: String): List<Equipment>
    fun moveEquipmentToRoom(equipmentId: String, roomId: String)
    fun withdrawEquipmentFromRoom(equipmentId: String, roomId: String)

}