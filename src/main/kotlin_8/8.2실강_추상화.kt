package main.kotlin_8

abstract class Shape(override var x: Double, override var y: Double): Measurable {
    abstract override val area: Double
}

interface Measurable {
    val x: Double
    val y: Double

    val area: Double
    val width: Double
    val height: Double

    val distanceFromOrigin: Double
        get() = Math.sqrt(x*x + y*y)
}

class Rectangle(x: Double, y: Double, override var width: Double, override var height: Double): Shape(x, y), Measurable {
    override val area: Double
        get() = width * height
}

class Circle(x: Double, y: Double, var radius: Double): Shape(x, y), Measurable{
    override val area: Double
        get() = Math.PI * radius * radius

    override val width: Double
        get() = radius * 2
}

fun main(args: Array<String>) {
    val r = Rectangle(10.0, 10.0, 3.0, 4.0)
    val c = Circle(5.0, 5.0, 2.0)

    val arr: Array<Shape> = arrayOf(r, c)

    for( s in arr ){
        println("Area is ${s.area}")
    }
}