package main.kotlin_3.`kotlin_3-3`

// kotlin_3-3-1 조건문

//fun max(a: Int, b: Int): Int{
//    if (a==b){
//        return 123
//    }
//    else if (a>b) {
//        return a
//    }
//    else{
//        return b
//    }
//}
//
//fun main(){
//    print("a: ")
//    val a = readLine()!!.toInt()
//    print("b: ")
//    val b = readLine()!!.toInt()
//    print("max: ${max(a,b)}")
//}

//fun main(){
//    val s = readLine()!!
//    val i = s.indexOf("/")
//
//    val result = if(i>=0){
//        val a = s.substring(0, i).toInt()
//        val b = s.substring(i+1).toInt()
//        (a/b).toString()
//    }else "there's not a division"
//
//    print("$result")
//}

fun renamePackage(fullName:String, newName: String): String{
    val i = fullName.lastIndexOf(".")

    val prefix = if(i >= 0) fullName.substring(0, i+1) else return newName

    return prefix + newName
}

fun main(){
    val s = readLine()!!

    println(renamePackage(s, "newName"))
}