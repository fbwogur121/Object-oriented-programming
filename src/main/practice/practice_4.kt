package main.practice

import java.lang.IllegalArgumentException

class Car(val name: String, var speed: Double = 0.0) {
    var distance: Double = 0.0
        private set
    private var time_now: Double = 0.0

    var time: Double
        get() = time_now
        set(value) {
            if (value >= time_now) {
                distance += (value - time_now) * speed
                time_now = value
            } else {
                throw IllegalArgumentException("time error")
            }
        }
}

class Track {
    private val cars = Array<Car?>(8) { null }
    private var numCars = 0

    var time: Double = 0.0
        set(value) {
            if (value >= field) {
                field = value
                for (i in 0 .. numCars) {
                    cars[i]?.time = value
                }
            } else {
                throw IllegalArgumentException("time error")
            }
        }

    fun addCar(c: Car) {
        if (numCars < cars.size) {
            cars[numCars] = c
            numCars += 1
        }
    }
}

fun main() {
    val track = Track()

    val a = Car("Alpha")
    track.addCar(a)
    val b = Car("Bravo", 30.0)
    track.addCar(b)

    while (a.distance <= b.distance) {
        track.time += 1.0
        a.speed += 1.0
    }

    println("${a.name} passed ${b.name} at ${track.time} seconds")
}
