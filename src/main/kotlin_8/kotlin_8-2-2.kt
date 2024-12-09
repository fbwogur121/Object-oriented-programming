package main.kotlin_8

interface Vehicle2{
    val currentSpeed: Double
    val isMoving get() = currentSpeed != 0.0
    fun start()
    fun stop()

    fun report(){
        println(if(isMoving) "Moving at ${currentSpeed}" else "Stopped")
    }
}

class Car2 : Vehicle2{
    override var currentSpeed = 0.0
        private set

    override fun start() {
        println("Start riding")
        currentSpeed = 50.0
    }

    override fun stop() {
        println("Stop riding")
        currentSpeed = 0.0
    }
}

fun main(){
    val v: Vehicle2 = Car2()

    v.start()
    v.report()
    println("Current Speed = ${v.currentSpeed}")
    v.stop()
    v.report()
    println("Current Speed = ${v.currentSpeed}")
}