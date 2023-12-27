package com.minwoo.kopring.grammar.basic

fun main() {

    // 1. 기본타입
    var intNumber: Int? = 3
    var longNumber: Long = intNumber?.toLong() ?: 0L
    // 명시적으로 변환이 강제됨(to변환타입())
    // nullable 처리도 추가적으로 필요

    println(longNumber)

    // 2. 일반타입
    printNameIfPerson(PersonKotlin("test", 10))
    printWarningIfNotPerson(null);

    // 3. 문자열 처리
    concatString()
    multiLine()
    getChar()
}

// Any == Object
fun printNameIfPerson(obj: Any?) {
    if(obj is PersonKotlin) {
        val person = obj as? PersonKotlin // 생략 가능(smart cast)
                                    // as? : obj가 null이거나 확인 타입이 아니면 둘다 null 처리
        println(person?.name)
    }
}

fun printWarningIfNotPerson(obj: Any?) {
    if(obj !is PersonKotlin) {
        // val person = obj as Person // 생략 가능(smart cast)
        println("warn");
    }
}

fun concatString() {
    var person = PersonKotlin("test", 10);
    var name = "test2";

    println("test sentence ${person.name} $name")
}

fun multiLine() {
    var test ="""
        test1
        test2
        test3
    """.trimIndent()

    println(test)
}

fun getChar() {
    var str = "abcde"
    println(str[2])
}