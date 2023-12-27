package com.minwoo.kopring.grammar.basic

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import com.minwoo.kopring.grammar.basic.FilePrinter as FilePrinter1

fun main() {
    //println(parseIntOrThrow("test"))
    val filePrinter = FilePrinter1()
    filePrinter.readFile()
}

fun parseIntOrThrow(str: String):Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str}을 숫자로 변환 실패")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    // expression 사용 가능
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

class FilePrinter {

    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        // 모든 예외는 unchecked exception(throws 사용 x)
        println(reader.readLine())
        reader.close()
    }

    fun readFile2(path: String) {
        // try with resource 방식의 kotlin 방식(use-inline 확장 함수)
        BufferedReader(FileReader(path)).use { readers ->
            println(readers.readLine())
        }
    }

}