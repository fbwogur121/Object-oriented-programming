package main.kotlin_8

class Holder {
    val o: Any get() = ""
}

fun main(){
    // is 연산자
    val objects = arrayOf("1", 2, "3", 4) // Any 타입의 배열
    var sum = 0
    var text = ""

    for( obj in objects ){
        if( obj is Int ){
            println(obj*2)
            sum += obj
        }
        if( obj !is Int ){
            println(obj)
            text += obj
        }
    }
    println("$sum, $text")

    // as 연산자
    val o: Any = 123
    println((o as Int) + 1)
    println((o as? Int)!! + 1)
    println((o as? String ?: "").length)
    //println((o as String).length) > error

    println(o as? String)
    //println(o as String?) > error

    // 프로퍼티와 스마트캐스트
    val holder = Holder()
    (holder.o as? String)?.let{it ->
        println(it.length)
    }
}