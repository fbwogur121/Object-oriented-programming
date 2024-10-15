package main.kotlin_4.`kotlin_4-3`

//private val prefix = "Hello, "
//
//fun main(){
//    val name = readLine()?: return
//    println("$prefix$name")
//}

//class Person(val firstName: String, val familyName: String){
//    val fullName: String
//        get() {
//            return "$firstName $familyName"
//        }
//}
//
//fun main(){
//    val p = Person("jaehyeok", "ryu")
//    println(p.fullName)
//}

//class Person(val firstName: String, val familyName: String, age: Int){
//    val fullName: String
//        get() {
//            return "$firstName $familyName"
//        }
//    val age = age
//        get(){
//            return field
//        }
//}
//
//fun main(){
//    val p = Person("jaehyeok", "ryu", 20)
//    println(p.fullName)
//    println(p.age)
//    println("${p.fullName} ${p.age}")
//}

//class Person(val firstName: String, val familyName: String){
//    val fullName: String
//        get() {
//            return "$firstName $familyName"
//        }
//    var age: Int? = null
//        set(value){
//            if(value != null && value <= 0)
//                throw IllegalArgumentException("Invalid age: $age")
//
//            field = value
//        }
//}
//
//fun main(){
//    val p = Person("jaehyeok", "ryu")
//    p.age = 20
//    println(p.age)
//}


class Person(var firstName: String, var familyName: String){
    var fullName: String
        get() = "$firstName $familyName"
        set(value){
            val names = value.split(" ")
            if (names.size != 2){
                throw IllegalArgumentException("Invalid full name: $value")
            }
            firstName = names[0]
            familyName = names[1]
        }
}

fun main(){
    val p = Person("jaehyeok2", "ryu")
    println(p.firstName)
    println(p.familyName)
    println(p.fullName)

    p.fullName = "jaehyeok ryu"
    println(p.firstName)
    println(p.familyName)
    println(p.fullName)
}