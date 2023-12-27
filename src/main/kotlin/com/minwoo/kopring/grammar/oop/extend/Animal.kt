package com.minwoo.kopring.grammar.oop.extend

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // properties를 override하기 위해서는 open이라는 키워드 필요
) {
    abstract fun move()
}