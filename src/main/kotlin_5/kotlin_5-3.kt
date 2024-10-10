package main.kotlin_5

val IntRange.leftHalf: IntRange
    get() = start..(start+endInclusive)/2

fun main(){
    println(1..3)
    println(1 until 10)
    println((1..3).leftHalf)
    println((1 until 10).leftHalf)
}