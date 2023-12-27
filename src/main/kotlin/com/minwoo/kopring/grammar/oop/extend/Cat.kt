package com.minwoo.kopring.grammar.oop.extend

import com.minwoo.kopring.grammar.oop.extend.Animal

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("${this.species} move")
    }

    // 외부에서 사용하기 위한 별도 getter 필요
    val catLegCount: Int
        get() = this.legCount

}