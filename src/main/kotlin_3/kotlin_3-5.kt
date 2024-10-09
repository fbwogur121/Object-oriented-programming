package main.kotlin_3

//throw문
//fun parseIntNumberInBinary(s: String): Int{
//    var num = 0
//
//    if(s.length !in 1 .. 31) throw NumberFormatException("Not a Number: $s")
//
//    for (c in s) {
//        if(c !in '0'..'1') throw NumberFormatException("Not a Number: $s")
//        num = num*2 + (c-'0')
//    }
//    return num
//}
//
//fun main(){
//    val s = readLine()!!
//
//    println("Int number: ${parseIntNumberInBinary(s)}")
//}

//try-catch문
fun parseIntNumberInBinary(s: String): Int{
    var num = 0
    println("자원 할당")

    try {
        if (s.length !in 1..31) throw NumberFormatException("Not a Number: $s")

        for (c in s) {
            if (c !in '0'..'1') throw NumberFormatException("Not a Number: $s")
            num = num * 2 + (c - '0')
        }
    } finally {
        println("자원 정리")
    }
    return num
}

fun main(){
    val s = readLine()!!
    var num :Int

    try{
        num = parseIntNumberInBinary(s)
    } catch(e: NumberFormatException){
        num = -1
    }
    println("Number is $num")
}