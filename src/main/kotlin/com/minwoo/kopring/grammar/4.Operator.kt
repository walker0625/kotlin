package com.minwoo.kopring.grammar

fun main() {
    compareMoney()
    plusMoney()
}

fun compareMoney() {
    val money1 = MoneyKotlin(100)
    val money2 = MoneyKotlin(100)

    println(money1 > money2) // 기존은 compareTo 결과값(-1, 0, 1)을 가지고 처리
    println(money1 == money2) // 값 비교 : equals()
    println(money1 === money2) // 객체 주소값까지 비교
}

fun plusMoney() {
    val money1 = MoneyKotlin(100)
    val money2 = MoneyKotlin(100)

    println(money1 + money2) // 연산자 오버로딩으로 객체간의 연산자 사용이 가능
}