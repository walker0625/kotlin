package com.minwoo.kopring.grammar.fp

data class FruitDto (
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)

fun main() {

    val fruits = listOf(
        FruitDto(1,"apple", 2000, 3000),
        FruitDto(2,"apple", 2000, 4000),
        FruitDto(3,"apple", 2000, 5000),
        FruitDto(4,"apple", 2000, 6000),
        FruitDto(5,"apple", 2000, 7000),
        FruitDto(6,"banana", 3000, 4000),
        FruitDto(7,"banana", 3000, 5000),
        FruitDto(8,"banana", 3000, 6000)
    )

    val apples = fruits.filter { fruit -> fruit.name == "apple" }

    val apples2 = fruits.filterIndexed { index, fruit ->
        println(index)
        fruit.name == "apple"
    }

    fruits.filter { fruit -> fruit.name == "apple" }
        .map { fruit -> fruit.currentPrice}
        .forEach{price -> println(price)}

    filterFruits(fruits) { fruit -> fruit.name == "apple" && fruit.currentPrice < 5000}
        .forEach{apple -> println(apple.id) }

    // Boolean return
    val all = fruits.all { fruit -> fruit.name == "apple" && fruit.currentPrice > 1000 }
    val none = fruits.none { fruit -> fruit.name == "apple" }
    val any = fruits.any { fruit -> fruit.name == "apple" }

    fruits.count()
    
    fruits.sortedBy { fruit -> fruit.currentPrice }
    fruits.sortedByDescending { fruit -> fruit.currentPrice }
    
    fruits.distinctBy { fruit -> fruit.name }
    
    fruits.first()
    fruits.firstOrNull()
    fruits.last()
    fruits.lastOrNull()

    val map: Map<String, List<FruitDto>> = fruits.groupBy { fruit -> fruit.name }

    val unique: Map<Long, FruitDto> = fruits.associateBy { fruit -> fruit.id }

    val keyValue: Map<String, List<Long>> = fruits.groupBy(
        {fruit -> fruit.name}, {fruit -> fruit.currentPrice}
    )

    val uniqueKeyValue: Map<Long, Long> = fruits.associateBy(
        {fruit -> fruit.id}, {fruit -> fruit.currentPrice}
    )

}

fun filterFruits (
    fruits: List<FruitDto>,
    filter: (FruitDto) -> Boolean
): List<FruitDto>{
    return fruits.filter(filter)
}

