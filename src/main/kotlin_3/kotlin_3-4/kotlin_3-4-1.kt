package main.kotlin_3.`kotlin_3-4`

//fun main(){
//    var sum = 0
//
//    do {
//        val num = readLine()!!.toInt()
//        sum += num
//    } while (num != 0)
//
//    println("sum = $sum")
//}

//import kotlin.random.Random
//
//fun main(){
//    val num = Random.nextInt(1, 101)
//    var guess = 0
//
//    while(guess != num){
//        guess = readLine()!!.toInt()
//        if(guess < num) println("Too small")
//        if(guess > num) println("Too large")
//    }
//    println("Right! the number is $num")
//}

import kotlin.random.Random

fun main(){
    val num = Random.nextInt(1, 101)

    do{
        val guess = readLine()!!.toInt()
        if(guess < num) println("Too small")
        if(guess > num) println("Too large")
    }while (guess != num)
    println("Right! the number is $num")
}