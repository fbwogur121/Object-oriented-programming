package main.kotlin_4.`kotlin_4-2`

//fun isLetterString(s: String?): Boolean {
//    if(s==null) return false
//
//    if(s.isEmpty()) return false
//    for(ch in s){
//        if(!ch.isLetter()) return false
//    }
//    return true
//}
//
//fun isBooleanString(s: String?) = s=="true" || s=="false"
//
//fun main(){
//    println(isLetterString("abc")) // OK
//    //(isLetterString(null))  // Error
//
//    val a: String? = "abc"
//    // val c: String = a // error: type mismatch
//    println(isBooleanString(null))
//    println(isBooleanString(a))
//}


fun describeNumber(n: Int?)
    = when {
        n == null -> "null"
        n >= 0 && n <= 10 -> "Small"
        n > 10 && n <= 100 -> "Large"
        else -> "out of range"
    }

fun isSingleChar(s: String?)
    = s != null && s.length == 1

fun main(){
    println(describeNumber(null)) // out of range에 걸리지 않음.
    println(describeNumber(2))
    println(describeNumber(50))
    println(describeNumber(500))

    println(isSingleChar(null))
}

