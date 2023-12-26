package com.minwoo.kopring.grammar

fun main() {
    defaultParam("test", newLine = false); // parameter를 지정해서 넣어줌(like builder)

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array) // 변수 형태를 사용할 때는 * 사용
}

fun max(a: Int, b: Int) = if (a > b) a  else b

fun defaultParam(
        str: String,
        num: Int = 3, // 기본값(option)
        newLine: Boolean = true) { // 기본값(option)

    for (i in 1..num) {
        if (newLine) {
            println(str)
        } else {
            print(str)
        }
    }

}

fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}
