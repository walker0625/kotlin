package com.minwoo.kopring.grammar.basic

// array를 쓰는 것보다는 collection(List)을 사용하는 것이 권장되기는 함
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