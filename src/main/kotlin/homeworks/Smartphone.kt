package homeworks

abstract class Smartphone : ElectronicDevices() {
    open val operationalSystem: String = ""
    val mobileProvider: String = ""

    override fun turnOn(electronicDevices: ElectronicDevices){
        println("Phone is working")

    }

    fun call(){

    }

    fun turnOff(){

    }
}