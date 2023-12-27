package com.minwoo.kopring.grammar.fp

fun main() {
    //immutableList()
    //mutableList()
    //set()
    map()
}

fun map() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[0] = "test0"
    oldMap[1] = "test1"
    oldMap.put(2, "test2")

    for (map in oldMap) {
        println(map)
    }

    val lineMap = mapOf(0 to "test0", 1 to "test1")

    for (key in lineMap.keys) {
        println(key)
    }

    for ((key, value) in lineMap.entries) {
        println("${key} / ${value}")
    }
}

fun set() {
    // 중복으로 표현되어 있으나 실제 조회시 200은 1개
    // 순서대로 index됨
    val set = setOf(300, 100, 200, 200)

    for (i in set) {
        println(i)
    }

    for ((index, value) in set.withIndex()) {
        println("${index} / ${value}")
    }
}

fun mutableList() {
    val numbers = mutableListOf(100, 200) // 기본값 ArrayList
    numbers.add(300)

    for (number in numbers) {
        println(number)
    }

}

fun immutableList() {
    // 불변 collection을 선언 때부터 지정(요소 추가/식제가 안되는 것이지 요소안의 속성 변화는 가능)
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    //numbers.add() 불가

    println(numbers[1])

    for (number in numbers) {
        println(number)
    }

    for ((index, value) in numbers.withIndex()) {
        println("${index} / ${value}")
    }
}

