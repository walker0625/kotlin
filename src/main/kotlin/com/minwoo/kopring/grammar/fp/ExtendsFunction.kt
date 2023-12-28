package com.minwoo.kopring.grammar.fp

fun main() {
    var test = "test123"
    println(test.lastChar())

    println(test addChar '4')
}

// String을 확장함수를 작성하여 사용하는 것이 가능
// 같은 시그니처인 경우 멤버함수가 우선됨
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 중위함수
infix fun String.addChar(char: Char): String {
    return this + char
}