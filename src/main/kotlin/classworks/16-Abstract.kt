package classworks

import java.io.InputStream

fun main(){

}

interface Device{
    companion object{
        const val DEVICE_TYPE = "Generic device"
    }
    val deviceId: String

    fun turnOn()
    fun turnOff()

    fun restart(){
        turnOn()
        logAction("")
        turnOff()
        logAction("")

    }
    private fun logAction(action: String){
    }
}

abstract class HouseholdAplication(val brand: String){
    abstract val applicationType: String


}

////////////////////////////////////////////////////////////////////
 class ElectricKettler(val brand: String): Powerable, Openable, WaterContainer, AutomaticShutdown, TemperatureRegulatable{
    override fun powerOn() {
    }

    override fun powerOff() {
    }

    override fun open() {
    }

    override fun close() {
    }

    override val capacity: Int
        get() = TODO("Not yet implemented")

    override fun fillWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun getWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override val sensorType: String
        get() = TODO("Not yet implemented")
    override val maxSensoredValue: Int
        get() = TODO("Not yet implemented")

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }

}

abstract class Fridge(val brand: String): Powerable, Openable, TemperatureRegulatable, LightEmitting, SoundEmitting {

}

abstract class VacuumCleaner(): Powerable, Openable, Cleanable {

}
abstract class RobotVacuumCleaner(): VacuumCleaner(), Timable, Rechargeable, SoundEmitting{

}

abstract class CoffeeBrewer: Powerable, Openable, TemperatureRegulatable, WaterContainer, Cleanable {

}


interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getCapacity(): Double
    fun recharge()
}