package main.실강_14주차

abstract class Actor(var name: String, var hp: Int) {
    abstract fun move(x: Int, y: Int)
}

class Knight(name: String, hp: Int): Actor(name, hp){
    override fun move(x: Int, y: Int) {
        println("($x, $y: 쿵쿵")
    }

}

class Magician(name: String, hp: Int, var mp: Int): Actor(name, hp) {
    override fun move(x: Int, y: Int) {
        println("샤샤삭")
    }
}

abstract class Stick<T: Actor>(val owner: T) {
    abstract fun attack()
    abstract fun defend()
}

//칼은 knight만 쓸 수 있음
abstract class Sword(owner: Knight) : Stick<Knight>(owner){
    override fun defend() {
        owner.hp -= 5
        println("팅")
    }
}

//wand는 magician만 쓸 수 있음
abstract class Wand(owner: Magician) : Stick<Magician>(owner){
    override fun defend() {
        owner.hp -= 5
        owner.mp -= 5
        println("펑")
    }
}

fun main(args: Array<String>) {
    println("")
}