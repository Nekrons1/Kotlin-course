package org.belafu.kotlincourse.lesson20

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
    fun playSound(stream: //InputStream)
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
    fun getChargeLevel(): Double
    fun recharge()
}
abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable
abstract class WashingMachine : Powerable, Openable, WaterContainer, TemperatureRegulatable, Timable, Drainable, Programmable
abstract class SmartLamp : Powerable, LightEmitting
abstract class DigitalClock : Powerable, Timable
abstract class RobotVacuumCleaner : Powerable, Movable, Cleanable, Rechargeable, Programmable
abstract class MechanicalClock : Mechanical, Timable
abstract class Flashlight : Powerable, LightEmitting, BatteryOperated
abstract class CoffeeMachine : Powerable, WaterContainer, TemperatureRegulatable, Drainable, Programmable
abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable


abstract class SwitchableDevice : Powerable {
    override fun powerOn() {
        println("Включить")
    }

    override fun powerOff() {
        println("Выключить")
    }
}

abstract class ProgrammableDevice : SwitchableDevice(), Programmable {
    override fun programAction(action: String) {
        println(action)
    }

    override fun execute() {
        println("Прекратить выполнение")
    }
}