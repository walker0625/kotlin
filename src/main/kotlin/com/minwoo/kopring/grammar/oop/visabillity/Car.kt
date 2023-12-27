package com.minwoo.kopring.grammar.oop.visabillity

// 코틀린은 기본적으로 package라는 개념에 기능이 없음(단순 위치를 의미하는 namespace 역할)
class Car (
    val Id: Long, // 기본 접근 제어자는 public
    internal val name: String, // internal : 같은 모듈(java 바이트 코드에서는 public로 인식됨)
    private var owner: String,
    _price: Int
) {

    var price = _price
        protected set // protected : 선언된 클래스(같은 패키지 x) 또는 상속된 패키지만 가능

}