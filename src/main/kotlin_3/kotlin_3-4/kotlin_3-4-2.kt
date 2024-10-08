package main.kotlin_3.`kotlin_3-4`

//fun main(){
//    val a = IntArray(10){it*it}
//    var sum = 0
//
//    for(x in a){
//        sum += x
//    }
//    println("sum of array is $sum")
//}

//fun main(){
//    val a = IntArray(10){it*it}
//    var sum = 0
//
//    for(i in 0..a.lastIndex){
//        a[i] = a[i]*2
//        println("a[$i] = ${a[i]}")
//        sum += a[i]
//    }
//    println("sum of array is $sum")
//}
fun main(){
    val a = IntArray(10){it*it}
    var sum = 0

    for(i in a.indices step 2){
        a[i] = a[i]*2
        println("a[$i] = ${a[i]}")
        sum += a[i]
    }
    println("sum of array is $sum")
}