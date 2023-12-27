package com.minwoo.kopring.grammar.oop.extra

fun main() {
    handleCountry(CountryEnum.KOREA)
    handleCountry(null)
}

enum class CountryEnum(
    val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(countryEnum: CountryEnum?) {

    when(countryEnum) {
        CountryEnum.KOREA -> println("안녕하세요")
        CountryEnum.AMERICA -> println("Hello")
        else -> println("???") // 필수가 아니므로 생략 가능(CountryEnum?가 아니라 CountryEnum이면)
    }
}