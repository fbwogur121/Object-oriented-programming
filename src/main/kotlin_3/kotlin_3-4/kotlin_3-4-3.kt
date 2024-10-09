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



////continue문
//fun countLetters(text: String): IntArray {
//    val counts = IntArray('z'-'a'+1)
//
//    for(char in text){
//        val charLower = char.toLowerCase()
//        if(charLower !in 'a'..'z') continue
//        counts[charLower - 'a'] ++
//    }
//    return counts
//}
//
//fun main(){
//    val text = readLine()!!
//    val counts = countLetters(text)
//
//    for(i in counts.indices){
//        println("${'a' + i} : ${counts[i]}")
//    }
//}

fun indexOf(subArray:IntArray, array: IntArray): Int{
    outerLoop@ for (i in array.indices) {
        for (j in subArray.indices){
            if( array[i+j] != subArray[j] ) continue@outerLoop
        }
        return i
    }
    return -1
}

fun main(){
    print("Enter the elements of the main array separated by spaces: ")
    val arryay = readLine()?.split(" ")?.map {it.toInt()}?.toIntArray() ?: intArrayOf()
    print("Enter the elements of the subArray separated by spaces: ")
    val subArryay = readLine()?.split(" ")?.map {it.toInt()}?.toIntArray() ?: intArrayOf()

    val index = indexOf(subArryay,arryay)
    if(index != -1){
        println("subArray starts at index $index in the main array.")
    }else {
        println("subArray is not found in the main array.")
    }
}