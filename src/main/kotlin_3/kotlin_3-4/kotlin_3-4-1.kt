package main.kotlin_3.`kotlin_3-4`

fun main(){
    var sum = 0

    do {
        val num = readLine()!!.toInt()
        sum += num
    } while (num != 0)

    println("sum = $sum")
}