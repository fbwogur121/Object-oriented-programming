//package main.kotlin_8
//
//// 상속할 수 있는 클래스: open class로 선언
//open class Shape(var x: Double, var y: Double) {
//    open fun getDistanceFromOrigin(): Double{
//        return Math.sqrt(x*x + y*y)
//    }
//
//    open val getDistanceFromOrigin1: Double
//        get() = Math.sqrt(x*x + y*y)
//}
//
//class Rectangle(x: Double, y: Double,var width: Double, var height: Double) : Shape(x, y){
//
//}
//
//class Circle(x: Double, y: Double, var radius: Double) : Shape(x, y) {
//    override fun getDistanceFromOrigin() : Double {
//        val d = Math.sqrt(x*x + y*y)
//        return if( radius > d ) 0.0 else d-radius
//    }
//
//    override val getDistanceFromOrigin1: Double
//        get() {
//            val d = super.getDistanceFromOrigin1
//            return if( radius > d ) 0.0 else d-radius
//        }
//}
//
//fun main(){
//    val c = Circle(1.0,1.0,0.5)
//    val r = Rectangle(-1.0, -1.0, 2.0, 3.0)
//    val arr: Array<Shape> = arrayOf(c, r)
//
//    for(s in arr) {
//        println("the coordinate of the shape is (${s.x}, ${s.y}), ${s.getDistanceFromOrigin()}, ${s.getDistanceFromOrigin1}")
//
//        //타입캐스팅 방법1
//        if(s is Circle) {
//            println("Radius is ${s.radius}")
//        }
//
//        //타입캐스팅 방법2
//        (s as? Circle)?.let{
//            println("Radius is ${it.radius}")
//        }
//    }
//}
