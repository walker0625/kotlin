package com.minwoo.kopring.grammar.fp

fun main() {
    println(isApple(fruits[0]))
    println(isApple.invoke(fruits[0]))

    println(isApple2(fruits[7]))
    println(isApple2.invoke(fruits[7]))

    val filteredFruits = filterFruits(fruits, isApple)

    for (f in filteredFruits) {
        println(f.name)
    }

    // 마지막 파라미터가 함수인 경우
    //val filteredFruits2 = filterFruits(fruits) {it.name == "apple"}
    // 명시적으로 써주는 것을 권장
    val filteredFruits2 = filterFruits(fruits) {fruit -> fruit.name == "apple"}

    for (f in filteredFruits2) {
        println(f.name)
    }

}

class Fruit (
    val name: String,
    val price: Int
)

val fruits = listOf(
    Fruit("apple", 1000),
    Fruit("apple", 2000),
    Fruit("apple", 3000),
    Fruit("apple", 4000),
    Fruit("apple", 5000),
    Fruit("banana", 1000),
    Fruit("banana", 2000),
    Fruit("banana", 3000),
)

val isApple: (Fruit) -> Boolean = fun(fruit : Fruit): Boolean {
    return fruit.name == "apple"
}

val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "apple"}

fun filterFruits (
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean // 함수 자체를 parameter로 받을 수 있음
): List<Fruit>{
    var results = mutableListOf<Fruit>()

    for(fruit in fruits) {
        if(filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}
