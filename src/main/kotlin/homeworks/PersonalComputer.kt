package homeworks

abstract class PersonalComputer(private val hardware: Hardware):OS, ExternalController {

    override val baseOsVersion: String = "23.11"

    override fun buttonDeviceOn() {
        hardware.buttonDeviceOn()
    }

    override fun keyboard() {
        TODO("Not yet implemented")
    }

    override val mice: String
        get() = TODO("Not yet implemented")
}
