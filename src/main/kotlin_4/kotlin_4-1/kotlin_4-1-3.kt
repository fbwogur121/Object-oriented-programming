package main.kotlin_4.`kotlin_4-1`

//nested class
//class Person(val id: Id, val age: Int){
//    class Id(val firstName: String, val familyName: String)
//
//    fun showMe()= println("${id.firstName} ${id.familyName}\nage: $age")
//}
//
//fun main(){
//    val id = Person.Id("jaehyeok","Ryu")
//    val person: Person = Person(id, 23)
//
//    person.showMe()
//}

//inner class
//class Person(val firstName: String, val familyName: String){
//    inner class Possession(val description: String){
//        fun showOwner() = println(fullName())
//        fun getOwner() = this@Person
//    }
//    private fun fullName() = "$firstName $familyName"
//}
//
//fun main(){
//    val person = Person("jaehyeok", "Ryu")
//    val wallet = person.Possession("Wallet")
//    wallet.showOwner()
//    //println(wallet.getOwner().fullName())
//}

// local class 지역 클래스
fun main(){
    var x = 1
    class Counter{
        fun increment() = x++
    }
    Counter().increment()
    println(x)
}