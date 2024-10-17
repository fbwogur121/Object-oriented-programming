package main.practice

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException


fun printGrade(name: String, point: Int) {
    val grade = when() {
        point >= 90 -> "A"
        point >= 80 -> "B"
        point >= 70 -> "C"
        point >= 60 -> "D"
        else -> "F"
    }
    println("$name has grade $grade")
}

fun main() {
    val fileName = "/Users/fbwogur121/Object-oriented-programming/src/main/practice/students.txt"

    try {
        val reader = BufferedReader(FileReader(fileName))
        try {
            val numStudents = reader.readLine().toIntOrNull()
                ?: throw IOException("Invalid number of students format")

            repeat(numStudents) {
                val name = reader.readLine() ?: throw IOException("Error reading name")
                val point = reader.readLine()?.toIntOrNull()
                    ?: throw IOException("Error reading point")

                printGrade(name, point)
            }
        } catch (e: IOException) {
            System.err.println("File I/O Error: ${e.message}")
        } finally {
            reader.close()
        }
    } catch (e: FileNotFoundException) {
        System.err.println("File Not Found: ${e.message}")
    }
}
