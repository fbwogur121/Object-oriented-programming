package main.kotlin_4.`kotlin_4-1`

//class Person{
//    var firstName: String = ""
//    var familyName: String = ""
//    var age: Int = 0
//
//    fun fullName() = "$firstName $familyName"
//    fun showMe(){
//        println("${fullName()}: $age")
//    }
//}
//
//fun main(){
//    val person: Person = Person()
//
//    person.firstName = "JaeHyeok"
//    person.familyName = "Ryu"
//    person.age = 24
//
//    person.showMe()
//}


//class Person(firstName: String, familyName: String){
//    val fullName = "$firstName $familyName"
//}
//
//fun main(){
//    val person: Person = Person("JaeHyeok", "Ryu")
//
//    println("${person.fullName}")
//}


//class Person(fullName: String){
//    val firstName: String
//    val familyName: String
//
//    init{
//        val names = fullName.split(" ")
//        if(names.size != 2) throw IllegalArgumentException("Invalid Name: $fullName")
//        firstName = names[0]
//        familyName = names[1]
//    }
//}
//
//fun main(){
//    val person: Person = Person("Jaehyeok Ryu")
//    println("firstName: ${person.firstName}\nfamilyName: ${person.familyName}")
//}

//// 주생성자
//class Person(fullName: String){
//    val firstName: String
//    val familyName: String
//
//    init{
//        val names = fullName.split(" ")
//        if(names.size != 2) throw IllegalArgumentException("Invalid Name: $fullName")
//        firstName = names[0]
//        familyName = names[1]
//    }
//}
//
//fun main(){
//    val person: Person = Person("Jaehyeok Ryu")
//    println("firstName: ${person.firstName}\nfamilyName: ${person.familyName}")
//}

//부생성자 constructor
//class Person{
//    val fullName: String
//    constructor(firstName: String, familyName: String){
//        fullName = "$firstName $familyName"
//    }
//    constructor(fullName: String){
//        this.fullName = fullName
//    }
//}
//
//fun main(){
//    val person: Person = Person("Jaehyeok", "Ryu")
//
//    println(person.fullName)
//
//    val person2: Person = Person("jane Doe")
//    println(person2.fullName)
//}