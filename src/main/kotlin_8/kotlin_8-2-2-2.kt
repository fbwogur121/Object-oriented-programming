package main.kotlin_8

interface Car3 {
    fun ride()
    fun move(){
        println("I'm riding move")
    }
}

interface Aircraft2{
    fun fly()
}

interface Ship{
    fun sail()
    fun move(){
        println("I'm sailing move")
    }
}

interface FlyingCar: Car3, Aircraft2

class Transformer: Car3, FlyingCar, Ship{
    override fun ride(){
        println("I'm riding")
    }
    override fun fly(){
        println("I'm flying")
    }
    override fun sail(){
        println("I'm sailing")
    }

    override fun move() {
        super<Car3>.move()
        println("OR")
        super<Ship>.move()
    }
}


fun main(){
    val t = Transformer()
    t.sail()
    t.ride()
    t.fly()

    val s: Ship = t
    s.sail()

    val fc: FlyingCar = t
    fc.fly()
    fc.ride()
    fc.move()
}