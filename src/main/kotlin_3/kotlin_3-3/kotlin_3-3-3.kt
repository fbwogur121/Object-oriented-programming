package main.kotlin_3.`kotlin_3-3`

//fun hexDigit(n: Int): Char{
//    if(n in 0..9) return '0'+n
//    else if (n in 10..15) return 'A'+n-10
//    else return '?'
//}
//
//fun main(){
//    val n = readLine()!!.toInt()
//    println(hexDigit(n))
//}

//fun hexDigit(n: Int): Char{
//    return when{
//        n in 0..9 -> '0'+n
//        n in 10..15 -> 'A'+n-10
//        else -> '?'
//    }
//}
//
//fun main(){
//    val n = readLine()!!.toInt()
//    println(hexDigit(n))
//}

fun numberDescription(n: Int): String = when(n){
    0 -> "Zero"
    1,2,3 -> "Small"
    in 4..9 -> "Midium"
    in 10 ..100 ->"Large"
    !in 0..Int.MAX_VALUE ->"Negative"
    else -> "Huge"
}

fun main(){
    val n = readLine()!!.toInt()
    println(numberDescription(n))
}