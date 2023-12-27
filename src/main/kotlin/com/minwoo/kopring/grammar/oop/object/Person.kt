package com.minwoo.kopring.grammar.oop.`object`

fun main() {
    Person.PersonFactory.newBaby("test1")
    val newBaby = Person.newBaby("test2")
    println(newBaby.name)

    println(Singleton.a)
    Singleton.a = 3
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
){

    companion object PersonFactory : Log{
        private const val MIN_AGE = 0

        @JvmStatic
        fun newBaby(name : String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("person create log")
        }

    }

}

object Singleton {
    var a: Int = 0
}