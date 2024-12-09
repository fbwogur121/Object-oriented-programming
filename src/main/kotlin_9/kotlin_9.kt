package main.kotlin_9

import java.util.function.DoublePredicate

open class DataHolder<T>(val data: T)

class TreeNode<T>(data: T): DataHolder<T>(data) {
    var parent: TreeNode<T>? = null
        private set

    val _children = arrayListOf<TreeNode<T>>()
    val children: List<TreeNode<T>> get() = _children
    fun addChild(data: T) = TreeNode<T>(data).also {
        _children += it
        it.parent = this
    }

    override fun toString(): String
        = _children.joinToString(prefix = "$data {", postfix = "}")

}

fun<T> TreeNode<T>.addChildren(vararg data: T){
    data.forEach {
        addChild(it)
    }
}

fun<T: Number> TreeNode<T>.averageChildren():Double {
    var count = 0
    var sum = 0.0
    children.forEach {
        sum += it.data.toDouble()
        count ++
    }
    return sum / count
}

fun main(){
    val list = ArrayList<Int>()
    list.add(4)
    list.add(8)
    list.forEachIndexed{ idx, v -> println("$idx: $v") }

    val list2 = ArrayList<String>()
    list2.add("hello")
    list2.add("world")
    list2.forEachIndexed{ idx, v -> println("$idx: $v") }

    val map: HashMap<String, Int> = HashMap()
    val arr: Array<String> = arrayOf("abc", "def")
    map["I"]=1
    map["V"]=5
    map["X"]=10
    map["L"]=50
    map.forEach{ key, value -> println("$key: $value") }
    arr.forEachIndexed{ idx, v -> println("$idx: $v") }

    val root = TreeNode("Hello").apply{
        addChild("World")
        addChild("!!")

        addChildren("Hello", "world2!!")
    }
    println(root)

    val root2 = TreeNode(1).apply{
        addChildren(2, 3)
    }
    println(root2.averageChildren())
}