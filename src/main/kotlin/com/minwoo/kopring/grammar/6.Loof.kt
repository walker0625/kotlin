package com.minwoo.kopring.grammar

fun main() {
    loofTest()
    println("-------------")
    loofTest2()
    println("-------------")
    loofTest3()
    println("-------------")
    whileTest()
}

fun loofTest() {
    val numbers = listOf(1,2,3)
    for (number in numbers) {
        println(number)
    }
}

fun loofTest2() {
    for (i in 1..3 step 2) {
        println(i)
    }
}

fun loofTest3() {
    for (i in 3 downTo 1 step 2) {
        println(i)
    }
}

fun whileTest() {
    var i = 0
    while (i < 3) {
        println(i)
        ++i
    }
}