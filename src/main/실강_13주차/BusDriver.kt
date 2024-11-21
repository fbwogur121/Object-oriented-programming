package main.실강_13주차

open class Employee {
    var wage = 0.0
    var commutingTime = 9.0

    fun commute() {
        println("출근..")
    }
}

interface Driveable {
    val licenseID: String
    open fun drive(carType: String) {
        println("절레절레")
    }
}

class DrivableFirst: Driveable {
    override val licenseID: String=""
    override fun drive(carType: String) {
        when(carType) {
            "Bus" -> println("부릉부릉")
            "Sedan" -> println("부릉부릉")
            "지게차" -> println("절레절레")
        }
    }
}

class BusDriver(val drivingDelegate: DrivableFirst) : Employee(),
    Driveable by drivingDelegate {
}

fun main(args: Array<String>){
    val b = BusDriver(DrivableFirst())
    b.drive("Bus")
}