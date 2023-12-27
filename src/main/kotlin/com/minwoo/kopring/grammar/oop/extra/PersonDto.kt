package com.minwoo.kopring.grammar.oop.extra

fun main() {
    // builder처럼 사용도 가능
    val personDto = PersonDto(name = "test", age = 100);
    val personDto2 =PersonDto("test", 100);

    println(personDto == personDto2)
    println(personDto)
}

// equals, hashCode, toString 자동 생성
data class PersonDto(
    val name: String,
    val age: Int
)