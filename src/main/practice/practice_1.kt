package main.practice

fun main() {
//    print("첫번째 정수를 입력하세요: ")
//    val first = readLine()?.toIntOrNull() ?: 0
//    print("두번째 정수를 입력하세요: ")
//    val second = readLine()?.toIntOrNull() ?: 0
//    print("세번째 정수를 입력하세요: ")
//    val third = readLine()?.toIntOrNull() ?: 0
    print("첫번째 정수를 입력하세요: ")
    val first = readLine()!!.toInt()
    print("두번째 정수를 입력하세요: ")
    val second = readLine()!!.toInt()
    print("세번째 정수를 입력하세요: ")
    val third = readLine()!!.toInt()

    val sum = first + second + third
    println("$first + $second + $third = $sum 입니다")
    val path = System.getProperty("user.dir")
    println(path)
}
