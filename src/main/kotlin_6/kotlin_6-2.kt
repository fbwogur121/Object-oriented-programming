package main.kotlin_6

data class Person(val firstName: String,
                  val familyName: String,
                  val age: Int)

fun Person.show() = println("$firstName $familyName: $age")

fun main() {
    val person1 = Person("John", "Doe", 25)
    val person2 = Person("John", "Doe", 25)
    val person3 = person1

    println(person1 == person2)
    println(person1 == person3)

    person1.show() // John Doe: 25
    person1.copy().show() // John Doe: 25
    person1.copy(familyName = "Smith").show() // John Smith: 25
    person1.copy(age = 30, firstName = "Jane").show() // Jane Doe: 30
    person1.show() // John Doe: 25
    person1.copy().show() // John Doe: 25

    // 로컬 변경 사항
    val pair = Pair(1, "two")
    val triple = Triple(1, "two", false
