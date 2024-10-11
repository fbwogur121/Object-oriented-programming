package main.kotlin_5

//class Circle(var radius: Double){
//    val area: Double
//        get() = radius * radius *Math.PI
//}
//
//val Circle.circumference : Double
//    get() = radius * 2 * Math.PI
//
//fun main(){
//    val c = Circle(1.0)
//
//    println("${c.circumference}")
//}


// companion object
//class Circle(var radius: Double){
//    val area: Double
//        get() = radius * radius *Math.PI
//
//    //모든 Circle 클래스가 공유하는 변수를 만들고 싶으면 companion object 내에 선언한다.
//    companion object {
//        var numCircles = 0
//    }
//    init{
//        numCircles += 1
//    }
//}
//
//fun main(){
//    val c = Circle(1.0)
//    val a = Circle(2.0)
//    val b = Circle(3.0)
//
//    println("The number of circles is ${Circle.numCircles}")
//}

class Circle(var radius: Double){
    var x = 0.0
    var y = 0.0
    val area: Double
        get() = radius*radius*Math.PI
}

fun init_c(c: Circle){
    c.radius = 2.0
    c.x=7.0
    c.y= -3.1
}

fun main(){
    val c : Circle? = null

    c = Circle()

    c?.let {
        it.radius = 2.0
        it.x=7.0
        it.y= -3.1
    }

    println("The number of circles is ${c}")
}