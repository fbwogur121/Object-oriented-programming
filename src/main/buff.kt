package main

fun main(){
    val numbers = listOf(10, 20, 30, 40, 50)
    val result = numbers.map { it / 10 }
        .filter { it % 2 == 1 }
        .forEach { println(it) }

    val arr = arrayOf(0, 1, 4, 9, 16, 25)
    println(arr.slice(2..4))
    val slice = arr.sliceArray(2..4)

}