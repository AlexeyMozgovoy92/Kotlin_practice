package homeworks

abstract class ElectronicDevices {

    val ramSize: Int = 0
    val screenSize: Double = 0.0

    abstract fun turnOn(electronicDevices: ElectronicDevices)
}