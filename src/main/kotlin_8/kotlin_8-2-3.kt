package main.kotlin_8

sealed class Result{
    class Success( val value: Any ): Result() {
        fun showResult(){
            println(value)
        }
    }
    class Error( val message: String ): Result() {
        fun throwException(){
            throw Exception(message)
        }
    }
}

fun runComputation(): Result {
    val a = readLine()?.toIntOrNull() ?: return Result.Error("First arguement is invalid")
    val b = readLine()?.toIntOrNull() ?: return Result.Error("Second arguement is invalid")

    return Result.Success(a+b)
}

fun main(){
    println( when( val result = runComputation() )  {
        is Result.Success -> "Completed Successfully: ${result.value}"
        is Result.Error -> "Error!: ${result.message}"
    })
}
