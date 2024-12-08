package main.kotlin_7

import java.io.FileReader
import java.io.FileWriter

fun main(){
    val writer = FileWriter("data.txt")
    try {
        writer.write("a")
        writer.write("가")
        //writer.write("나")
    } finally {
        writer.close()
    }

    val reader = FileReader("data.txt")
    try{
        val first = reader.read().toChar()
        val second = reader.read().toChar()
        println("$first $second")

        val third = reader.read()
        println("$third")
    } finally {
        reader.close()
    }
}