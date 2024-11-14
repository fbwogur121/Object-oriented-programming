package main.실강_12주차.실강_12주차_코틀린

abstract class Shape(var x: Double, var y: Double) {

}

interface Measurable {
    val width: Double
    val height: Double
    val area: Double
        get() = width * height
}

class Rectangle(x: Double, y: Double,
                override var width: Double, override var height: Double)
    : Shape(x, y), Measurable {

}

class Circle(x: Double, y: Double, var radius: Double): Shape(x, y), Measurable {
    override val width: Double
        get() = 2.0 * radius
    override val height: Double
        get() = 2.0 * radius
    override val area: Double
        get() = Math.PI * radius * radius
}

fun main(args: Array<String>) {
    val r = Rectangle(10.0, 10.0, 3.0, 4.0)
    val c = Circle(5.0, 5.0, 2.0)
    val arr: Array<Measurable> = arrayOf(r, c)

    for(s in arr){
        println("Height is ${s.height}")
        println("Area is ${s.area}")
    }
}