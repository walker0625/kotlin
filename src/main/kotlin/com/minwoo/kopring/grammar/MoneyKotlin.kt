package com.minwoo.kopring.grammar

class MoneyKotlin(
    private val price: Int
) : Comparable<MoneyKotlin> {

    override fun compareTo(other: MoneyKotlin): Int {
        return price.compareTo(other.price)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MoneyKotlin

        return price == other.price
    }

    override fun hashCode(): Int {
        return price
    }

    operator fun plus(other: MoneyKotlin): MoneyKotlin {
        return MoneyKotlin(this.price + other.price)
    }

    override fun toString(): String {
        return this.price.toString()
    }

}