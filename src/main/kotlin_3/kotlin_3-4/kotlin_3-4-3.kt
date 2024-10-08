package main.kotlin_3.`kotlin_3-4`

import kotlin.random.Random

//break문
//fun main(){
//    val number = Random.nextInt(1, 101)
//
//    while(true){
//        val guess = readLine()!!.toInt()
//        if(guess < number) println("Small")
//        else if (guess > number) println("Large")
//        else break
//    }
//    println("Right number: $number")
//}



//continue문
fun countLetters(text: String): IntArray {
    val counts = IntArray('z'-'a'+1)

    for(char in text){
        val charLower = char.toLowerCase()
        if(charLower !in 'a'..'z') continue
        counts[charLower - 'a'] ++
    }
    return counts
}

fun main(){
    val text = readLine()!!
    val counts = countLetters(text)

    for(i in counts.indices){
        println("${'a' + i} : ${counts[i]}")
    }
}