package com.minwoo.kopring.grammar.oop.extend

fun main() {
    var cat = Cat("black")
    cat.move()

    // cat.legCount와 같이 외부에서 직접 접근이 불가해 만든 custom getter 사용
    println(cat.catLegCount)

    println("--------------------")

    var penguin = Penguin("navy")

    println(penguin.swimStat)
    penguin.act()
    println(penguin.legCount)

}
