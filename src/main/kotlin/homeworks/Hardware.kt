package homeworks

class Hardware(
    private val soundController: SoundController,
    private val powerSystem: PowerSystem,
): ExternalController {
    override fun buttonDeviceOn() {
        TODO("Not yet implemented")
    }

    override fun keyboard() {
        TODO("Not yet implemented")
    }


    override val mice: String
        get() = TODO("Not yet implemented")
}