package main.kotlin_5.`kotlin_5-5`

// run 영역함수
class Address {
    var city: String = ""
    var street: String = ""
    var house: String = ""
    fun post(message: String): String =
        "Message for ($city, $street, $house): $message"
}

fun main(){
    /* run 영역함수를 쓰지 않을 때는 println과 같은 레벨로 아래와 같이 써야 함.
    val addr = Address()
    addr.city = "London"
    addr.street = "Bakery Street"
    addr.house = "211b"
    val msg = addr.post("hello!")
     */

    //영역함수로 묶어 모듈화하는 것이 좋음

    // run
    val msg = Address().run {
        city = "London"
        street = "Bakery Street"
        house = "211b"
        post("Hello!")
    }

    // with
    val msg2 = with(Address()) {
        city = "London"
        street = "Bakery Street"
        house = "211b"
        post("Hello!")
    }

    println(msg)
    println(msg2)
}