package com.minwoo.kopring.grammar.oop.extend

interface Swimable {

    val swimStat: Int
        get() = 3

    //default 키워드 생략 가능
    fun act() {
        println("swin")
    }

}