package main.kotlin_6

fun main(){
    val ubyte: UByte = 1u
    val uint: UInt = 11u

    println(ubyte)
    println(uint)
    println("$ubyte, $uint")

    val u: UInt = 2u
    val s: Long = 1
    println(u.toInt() + s)
    println(u + s.toULong())
}