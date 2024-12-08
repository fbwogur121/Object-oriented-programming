//package main.kotlin_8
//
//open class Vehicle1() {
//    init {
//        println("Vehicle 초기화")
//    }
//}
//
//open class Car1: Vehicle1() {
//    init{
//        println("Car 초기화")
//    }
//}
//
//class Truck: Car1(){
//    init{
//        println("Truck 초기화")
//    }
//}
//
//open class Person(val name: String, val age: Int){
//    constructor( firstName: String, familyName: String, age: Int )
//        : this("$firstName $familyName $age")
//}
//
////상위 클래스 생성자로 데이터 전달
//class Student(name: String, age: Int, val university: String): Person(name, age){
//
//}
//
////부생성자에서의 상위클래스 생성자 호출
//class Student2: Person {
//    val university: String
//    constructor(name: String, age: Int, university: String): super(name, age){
//        this.university = university
//    }
//}
//
//// 주생성자가 있는 경우…
//class Student3: Person{
//    val university: String
//    constructor(name: String, age: Int, university: String): super(name, age){
//        this.university = university
//    }
//}
//
//class Student4: Person {
//    val university: String
//    constructor(name: String, age: Int, university: String): super(name, age){
//        this.university = university
//    }
//
//    constructor(firstName: String, familyName: String, age: Int, university: String)
//            : super(firstName, familyName, age){
//                this.university = university
//            }
//}
//
//
//fun main(){
//    val truck = Truck()
//
//    val student = Student("charlie", 23, "KAU")
//    println("${student.name} from ${student.university} is ${student.age} years old.")
//
//    val student2 = Student2("charlie", 23, "KAU")
//    println("${student2.name} from ${student2.university} is ${student2.age} years old.")
//}