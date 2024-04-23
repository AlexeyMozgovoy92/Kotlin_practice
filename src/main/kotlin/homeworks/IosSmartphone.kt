package homeworks

class IosSmartphone : Smartphone(){

    override val operationalSystem: String = "IOS"
    fun turnOn(ios: IosSmartphone){
        println("IOS smartphone is working")
    }
    fun printSystem(){
        println("My operational system is still $operationalSystem")
    }

}