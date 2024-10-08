fun main(){
    val size = readLine()!!.toInt()
    val squares = Array(size){(it+1)*(it+1)}

    println("${squares[0]} ${squares[1]} ${squares[2]} ${squares[3]}")
}