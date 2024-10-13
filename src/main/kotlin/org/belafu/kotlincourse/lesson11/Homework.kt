package org.belafu.kotlincourse.lesson11

fun main () {

    val firstmap = mapOf<Int, Int> ()

    val secondmap: Map <Float, Double> = mapOf(2.7182818284f to 2.0, 2.56534f to 2.3)

    val thirdmap: MutableMap <Int, String> = mutableMapOf()

    println(secondmap[2.7182818284f])

    thirdmap[3] = " Три"
    thirdmap [5] = " Пять"

    thirdmap.remove(5)

    println(thirdmap)

    thirdmap[3] = " Семь"

    println(thirdmap)

    }

fun addToMap(key: String, value: Int, map: MutableMap<String, Int>) {
    map[key] = value



    val map1 = mapOf("a" to 1, "b" to 2, "c" to 3)
    val map2: MutableMap<String, Int> = mutableMapOf("d" to 4, "e" to 5)


    for ((key, value) in map1) {
        addToMap(key, value, map2)
    }

    println(map2)
}


//    val a1 = 10.0
//    val a2 = 2
//
//
//    val newmap: Map <Double, Int> = mapOf(a1 to a2)
//
//    for ((key, value) in newmap)  {
//        while (key <= 0.0) {
//            if (value <= 0.0)
//                println("Бесконечность")
//
//        else {
//                println(key/value)
//            }}


