package com.minwoo.kopring.grammar

fun main() {

    //  1. var / val

    var mutableVariable: Long = 10L; // variable
    mutableVariable = 20L;

    val immutableValue: Long = 10L; // value(final) - 기본적으로는 val 추천
    // immutableValue = 20L;  // 수정 불가


    // 2. type

    // boxing unboxing을 자동 지원하므로 primitive 타입과 reference 타입을 신경쓰지 않아도 됨


    // 3. null 처리

    var nullableVariable: Long? = null;
    val nullableValue: Long? = null;


    // 4. 객체 선언

    var person = PersonKotlin("test", 10); // new를 사용하지 않음

}