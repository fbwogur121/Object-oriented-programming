package main.kotlin_5

class Person(val firstName: String, val familyName: String){
    companion object
}

val Person.Companion.UNKNOWN by lazy { Person("jaehyeok", "Ryu") }

fun IntRange.Companion.singletonRange(n: Int) = n..n

fun main(){
    println(IntRange.singletonRange(3))
    println(IntRange.Companion.singletonRange(4))

    val p = Person.UNKNOWN
    println(p.firstName)
}