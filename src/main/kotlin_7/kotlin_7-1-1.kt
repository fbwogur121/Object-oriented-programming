package main.kotlin_7
import java.util.LinkedList
import java.util.TreeSet

data class Person(val firstName: String, val familyName: String, val age: Int)
    : Comparable<Person>{
    val fullName get() = "$firstName $familyName $age"
    override fun compareTo(other: Person): Int = fullName.compareTo(other.fullName)
}

fun main(){
    // Array
    val arr = arrayOf("Hello", "world", "kotlin")

    for( elem in arr ) {
        println(elem)
    }

    // ArrayList
    val list = arrayListOf(1, 2, 3, 4, 5)
    list.add(2, 8) //2번째 index에 8을 넣어라
    println(list) // [1, 2, 8, 3, 4, 5]

    list.removeAt(0) // 0번째 index를 지워라
    println(list) // [2, 8, 3, 4, 5]
    val list3 = ArrayList<String>(100)
    list3.add("Hello")
    list3.add("World")
    list3.add(1, "This") // index 1에 This를 넣어라
    println(list3) // [Hello, This, World]

    // LinkedList
    val list2 = LinkedList<Int>()
    list2.add(1)
    list2.addFirst(3)
    list2.add(2)
    println(list2) // [3, 1, 2]

    list2.removeLast()
    list2.removeFirst()
    println(list2) // [1]

    // HashSet
    val s = hashSetOf("apple", "orange", "mango")
    s.contains("apple") // res0: kotlin.Boolean = true
    s.contains("사과") // res1: kotlin.Boolean = false

    println(s) // [orange, apple, mango] -> hashcode 순서로 저장되기 때문에 순서가 제멋대로임.

    val s2 = linkedSetOf("apple", "orange", "mango")
    println(s2) //[apple, orange, mango] linkedlist로 삽입한 순서를 기억하게 할 수 있음

    s2.remove("orange")
    s2.add("orange")
    println(s2) // [apple, mango, orange]

    // TreeSet
    val s3 = sortedSetOf("apple", "orange", "mango", "kiwi")
    println(s3)

    println(s3.lower("mango"))
    println(s3.higher("mango"))

    val s4 = sortedSetOf(Person("Jhon", "Doe", 30), Person("Jane", "Doe", 25))
    println(s4)
    println(s4.contains(Person("Jane", "Doe", 25)))
    println(s4.contains(Person("Jane", "Doe", 35)))

    // Map
    val m = hashMapOf(1 to "One", 2 to "Two", 3 to "Three")
    m[4] = "Four"
    m[100] = "One Hundred"
    println(m)
    println(m[5])
    println(m[100])

    val m2 = sortedMapOf(1 to "One", 2 to "Two", 3 to "Three")
    m2[4] = "Four"
    m2[100] = "One Hundred"
    println(m2)
    println(m2[5])
    println(m2[100])
}