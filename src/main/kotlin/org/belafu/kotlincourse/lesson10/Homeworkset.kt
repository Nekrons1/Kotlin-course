package org.belafu.kotlincourse.lesson10

fun main () {

    val setint: Set<Int?> = setOf()

    val intset: Set<Int> = setOf(1, 2, 3)


    val setstring: MutableSet<String> = mutableSetOf()
    setstring.addAll(listOf("Kotlin","Java", "Scala"), )

    println(setstring.toList())

    setstring.addAll(listOf("Swift", "Go"))

    println(setstring.toList())

    val mutableint: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    mutableint.remove(2)

    println(mutableint.toList())

    for (i in mutableint)
        println(i)



    }

