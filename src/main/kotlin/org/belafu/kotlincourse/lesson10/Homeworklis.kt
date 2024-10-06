package org.belafu.kotlincourse.lesson10

fun main () {
    val listof: List<Int> = listOf()

    val liststring: List<String> = listOf("Hello", "World", "Kotlin")


    val listint: MutableList<Int> = mutableListOf()
    for (i in 1..5) {
        listint.add(i)

        println(listint.toList())

        }

    for (i in 6..8) {
        listint.add(i)

        println(listint)
    }

    val stringmutable: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    stringmutable.remove("World")
    println(stringmutable.toList())
}
