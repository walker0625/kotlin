package com.minwoo.kopring.grammar

import java.lang.IllegalArgumentException

fun main() {

    //validateScoreIsNotNegative(-1)
    println(getPassOrFail(50))
    println(isIn100Range(100))

    // switch > when으로 바뀌어서 사용됨(좀 더 유연)
    println(whenTest(100))
    println(whenRangeTest(100))
    println(whenTypeTest(100))
    println(whenTypeTest("test"))
    println(whenTypeTest(true))
    println(judgeNumber(1))
    println(judgeNumber2(1))
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작습니다")
    }
}

fun getPassOrFail(score: Int): String {
    // 바로 return 가능(3항 연산자 없음)
    return if (score >= 50) {
        "Pass"
    } else {
        "Fail"
    }
}

fun isIn100Range(score: Int):String {
    return if (score in 0..100) {
        "in 100"
    } else {
        "out 100"
    }
}

fun whenTest(score: Int): String {
    return when (score/10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "ELSE"
    }
}

fun whenRangeTest(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70 ..79 -> "C"
        else -> "F"
    }
}

fun whenTypeTest(score: Any): String {
    return when (score) {
        is Int -> "number"
        is String -> "text"
        is Boolean -> "flag"
        else -> "else"
    }
}

fun judgeNumber(number: Int): String {
    return when(number) {
        1, 0, -1 -> "is 1,0,-1"
        else -> "is not in range"
    }
}

fun judgeNumber2(number: Int): String {
    return when {
        number == 0 -> "0입니다" // early return으로 동작
        number%2 == 0 -> "짝수입니다"
        else -> "홀수입니다"
    }
}

