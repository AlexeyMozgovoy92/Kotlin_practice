package homeworks

class AndroidSmartphone : Smartphone() {
    override val operationalSystem: String = "Android"

    fun turnOn(android: AndroidSmartphone){
        println("Android is working")
    }

}