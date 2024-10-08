package main.kotlin_3.`kotlin_3-3`

//fun main(){
//    val num = readLine()!!.toInt()
//    println("$num in 10 .. 99: ${num in 10 .. 99}")
//    println("$num in 10 until 99: ${num in 10 until 99}")
//    println("$num !in 10 .. 99: ${num !in 10 .. 99}")
//    println("$num !in 10 until 99: ${num !in 10 until 99}")
//
//    val str = readLine()!!
//    println("$str in \"def\" ... \"xyz\" : ${str in "def" .. "xyz"}")
//}

fun main(){
    val arr = IntArray(10) {it * it}

    val subArr = arr.sliceArray(2..5)
    for (n in subArr){
        println(n)
    }
}