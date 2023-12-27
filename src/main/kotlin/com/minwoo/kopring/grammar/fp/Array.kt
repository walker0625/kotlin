package com.minwoo.kopring.grammar.fp

fun main() {

    var array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} / ${array[i]}" )
    }

    array = array.plus(300) // 재할당 필요함

    for ((idx, value) in array.withIndex()) {
        println("${idx} / ${value}" )
    }

}