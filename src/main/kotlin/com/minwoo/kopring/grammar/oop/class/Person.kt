package com.minwoo.kopring.grammar.oop.`class`

fun main() {
    val person = Person("test1", 10)
    //println(person.name) // getter
    person.age = 20 // setter
    //println(person.age)

    val person2 = Person("test2")

    val person3 = Person().name
    println(person3)
}

// properties > getter/setter가 포함됨
// 생성자 생략
// properties 생략
class Person( // 주생성자는 필수
    name: String = "defaultTest",
    var age:Int = 1
) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화")
    }

    // 부생성자(default parameter가 권장되어 자주 쓰이지는 않음)
    constructor(name: String): this(name, 0) {
        println("부생성자1")
    }

    constructor(): this("testDefault") {
        println("부생성자2")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult2: Boolean get() = this.age >= 20 // custom getter

    var upperCaseName: String = name
        get() = name.uppercase() // backing field

    val upperCaseName2: String get() = this.name.uppercase()

    // custom setter(method로 하는 것 권장)
    var name: String = name
        set(value) {
            field = value.uppercase()
        }

}