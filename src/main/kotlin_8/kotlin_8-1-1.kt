package main.kotlin_8

open class Vehicle {
    var currentSpeed = 0

    open fun start(speed: Int) {
        println("I'm moving at $speed")
    }

    fun stop() {
        println("Stopped")
    }
}

open class Car: Vehicle() {
    override fun start(speed: Int){
        println("I'm riding at $speed")
    }
}

class Bus: Car() {
    override fun start(speed: Int) {
        println("I'm riding a bus")
    }
}


class Boat: Vehicle() {
    override fun start(speed: Int) {
        println("I'm sailing at $speed")
    }
}

open class FlyingVehicle: Vehicle() {
    fun takeOff(){
        println("이륙합니다")
    }
    fun landing() {
        println("착륙합니다")
    }
}

class Aircraft(val seats: Int) : FlyingVehicle()

fun main(){
    val aircraft = Aircraft(100)
    val vehicle: Vehicle = aircraft

    vehicle.start(4) // I'm moving at 4
    vehicle.stop()  // Stopped

    aircraft.start(90) // I'm moving at 90
    aircraft.stop()  // Stopped
    aircraft.landing()  // 착륙합니다
    aircraft.takeOff()  // 이륙합니다
    println(aircraft.seats) // 100

    val vehicle1: Car = Car()
    val vehicle2: Vehicle = Boat()
    vehicle1.start(100) // I'm riding at 100
    vehicle2.start(200) // I'm sailing at 200

    vehicle1.stop() // Stopped riding
    vehicle2.stop() // Stopped
}