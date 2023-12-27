package com.minwoo.kopring.grammar.oop.nested

class House(
    var address: String,
    var livingRoom: LivingRoom = LivingRoom(10.0)
) {

    // static 중첩 클래스(바깥과 참조가 없음 - 권장됨)
    class LivingRoom(
        private var area: Double
    )

    // inner 클래스(바깥을 참조 - 비권장)
    inner class LivingRoom2(
        private var area: Double
    ){
        val address: String
            get() = this@House.address
    }

}