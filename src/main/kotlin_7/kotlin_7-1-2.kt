package main.kotlin_7

fun main(){
    val a1 = listOf(1, 2, 3)
    //a1.add(4) -> error: list는 add 불가
    println(a1)

    val a2 = mutableListOf(1, 2, 3)
    a2.add(4)
    println(a2)

    val m1 = mapOf(1 to "I", 5 to "V", 10 to "X")
    println(m1)

    val m2 = mutableMapOf(1 to "I", 5 to "V", 10 to "X")
    m2.remove(5)
    m2.put(5, "five")
    println(m2)

    // Sequence - 크롤링할때 많이 쓰임. 크롤링하다가 의미있는 데이터가 나오면 yield 하는 방식
    val seq = sequence {
        yield(0)
        yieldAll(listOf(1, 2, 3))
        yieldAll(intArrayOf(4, 5, 6).iterator())
        yieldAll(generateSequence(10) { if (it<50) it * 3 else null })
    }
    var idx=0
    for( elem in seq ){
        println("$idx: $elem")
        idx++
    }

    // Collection 간의 변환
    val a = listOf(1, 2, 3, 2, 3)
    println(a)
    a.toSet()
    println(a)

    val b = listOf(1, 2, 3, 2, 3).toSet()
    println(b)

    val c = arrayOf("red", "green", "blue")
    for (elem in c){
        println("${elem}")
    }
    println(c.contentToString())
    println(c.toSortedSet())

    val d = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(d)
    println(d.toList())

    val e = sequenceOf(1 to "one", 2 to "two", 3 to "three")
    println(e)
    println(e.toMap())


    // iterator() 와 for문
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for( elem in map ){
        println("${elem.key} -> ${elem.value}")
    }
    for( (key, value) in map ){
        println("${key} -> ${value}")
    }

    map.forEach{ k, v -> println("${k} -> ${v}") }

    val arr = intArrayOf(1, 2, 3)
    arr.forEachIndexed{ idx, value -> println("$idx -> $value")}

    // Collection의 유틸리티_1
    val list = listOf(1, 2, 3)
    println(list.isEmpty()) // false
    println(list.size) // 3
    println(list.contains(4)) // false
    println(2 in list) // true
    println(list.containsAll(listOf(1, 2))) // true > (1, 2) 리스트의 원소를 모두 갖고있나?

    val list2 = list + 4
    println(list2) // [1, 2, 3, 4]
    val list4 = list - setOf(2, 5)
    println(list4) // [1, 3] > 2는 있으니 빼고 5는 없으니까 뺄 수 없다

    val list3 = arrayListOf(1, 2, 3)
    list3.add(4)
    list3.remove(3)
    list3.addAll(setOf(5, 6))
    list3.removeAll(listOf(1, 2))
    list3.retainAll(listOf(5, 6, 7))
    list3 += 4
    list3 -= 6
    list3 += setOf(8, 9)
    list3 -= listOf(7, 8)
    list3.clear()
    println(list3)

    // Collection의 유틸리티_2
    val list5 = listOf(1, 4, 6, 2, 4, 1, 7)
    println(list5.get(3))
    println(list5[3])
}