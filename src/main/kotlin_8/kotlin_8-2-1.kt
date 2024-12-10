package main.kotlin_8

import kotlin.math.PI

abstract class Entity( val name: String )

class Person: Entity{
    constructor(name: String): super(name)
    constructor(firstName: String, familyName: String)
            : super("$firstName $familyName")
}

abstract class Shape{
    abstract val width: Double
    abstract val height: Double
    abstract fun area(): Double
}

class Circle(val radius: Double): Shape(){
    override val width: Double
        get() = radius * 2
    override val height: Double
        get() = radius * 2

    override fun area(): Double =
        PI * radius * radius
}

class Rectangle(override val width: Double, override val height: Double): Shape(){
    override fun area(): Double = width * height
}

fun main(){
    val entity: Entity = Person("jh", "ryu")
    println(entity.name)

    val shape: Shape = Circle(1.0)
    println(shape.area())
    val shape2: Shape= Rectangle(1.0, 2.0)
    println(shape2.area())
}