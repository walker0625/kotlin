package com.minwoo.kopring.grammar.oop.extra

fun main() {
    val avante = Avante();

    when(avante) {
        is Avante -> println("AVANTE!")
    }
}

// 하위 클래스를 제한 when 사용시 유용
sealed class CarSealed (
    val name: String,
    val price: Long
)