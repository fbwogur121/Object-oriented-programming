package main.kotlin_8

class Address (
    val city: String,
    val street: String,
    val house: String
){
    override fun equals(other: Any?): Boolean {
        if( other !is Address ) return false
        if( city == other.city && street == other.street && house == other.house ){
            return true
        }
        return false
    }

    override fun hashCode(): Int {
        var code = city.hashCode()
        code = 31*code + street.hashCode()
        code = 31*code + house.hashCode()
        return code
    }

    override fun toString(): String {
        return "$city, $street, $house"
    }
}

fun main(){
    val address1 = Address("seoul", "mapo", "5")
    val address2 = Address("seoul", "mapo", "5")
    println(address1 == address2) // 구조적으로 동등한가? 내부의 값을 볼때
    println(address1 === address2) // 참조자가 같으냐(참조 동등성을 보고싶으면) ===
    println("address1.hashCode(): ${address1.hashCode()}\naddress2.hashCode(): ${address2.hashCode()}")

    val set = HashSet<Address>()
    set.add(address1)
    println(address2 in set) // fun hashCode() 가 없을시에는 false가 나온다. 구조적으로 동등하나 해쉬값이 다르므로.

    print(address1.toString()) // 사람이 읽기 좋게 재정의해주기.
}