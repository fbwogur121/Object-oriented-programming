//package main.practice
//
//class Car(val name: String, var speed: Double = 0.0) {
//    var distance: Double = 0.0
//}
//
//class Track {
//    private val cars = Array<Car?>(8) { _->null}
//    private var numCars = 0
//    var time = 0.0
//        private set
//
//    fun addCar(c: Car) {
//        if (numCars < cars.size) {
//            cars[numCars] = c
//            numCars += 1
//        }
//    }
//
//    fun timePassed(t: Double) {
//        for (i in 0..(numCars - 1)) {
//            val car = cars[i]
//            if (car != null) {
//                car.distance += t * car.speed
//            }
//        }
//        time += t
//    }
//
//    fun removeCar(num: Int) {
//        if (num >= 0 && num < cars.size) {
//            cars[num] = null
//        }
//    }
//}
//
//fun main() {
//    val track = Track()
//
//    val a = Car("Alpha")
//    track.addCar(a)
//    val b = Car("Bravo", 30.0)
//    track.addCar(b)
//
//    while (true) {
//        track.timePassed(1.0)
//        a.speed += 1.0
//        if (a.distance > b.distance) {
//            println("${a.name} passed ${b.name} at ${track.time}")
//            break
//        }
//    }
//}