package com.minwoo.kopring.grammar

fun main() {

    try {
        println(startWithA1_RE(null))
    } catch(e: IllegalArgumentException) {
        println("Exception")
    }

    println(startWithA2_RE(null))
    println(startWithA3_RE(null))
    //println(startWithA4(null))

    var str: String? = "ABC"
    println(str!!.length) // !! : 해당 변수가 절대 null이 아님을 컴파일러에게 전달
    str = null
    println(str?.length) // safe call : str이 null이면 전체가 null이 됨
    println(str?.length ?: 0) // elvis : str이 null이면 0

    var person = PersonKotlin("person1", 10);
    // notNullStr(person.name); person.name은 nullable이라 컴파일에서 오류 발생

}

fun startWithA1(str: String?): Boolean {
    if(str == null) {
        throw IllegalArgumentException("null argument")
    }

    return str.startsWith("A");
}

fun startWithA1_RE(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null args");
}

fun startWithA2(str: String?): Boolean? {
    if(str == null) {
        return null;
    }

    return str.startsWith("A")
}

fun startWithA2_RE(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    if(str == null) {
        return false
    }

    return str.startsWith("A")
}

fun startWithA3_RE(str: String?): Boolean {
    return str?.startsWith("A")
        ?: false
}

fun startWithA4(str: String?): Boolean {
    // 만약 str이 null이면 Runtime에 npe 발생(정말 null이 아닌 경우에만 명시적으로 사용!)
    return str!!.startsWith("A");
}

fun notNullStr(str: String): Boolean {
    return true
}