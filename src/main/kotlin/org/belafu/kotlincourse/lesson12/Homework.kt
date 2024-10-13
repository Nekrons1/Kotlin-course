package org.belafu.kotlincourse.lesson12

fun main () {

    fun fun1 () {

    }

    fun fun2(a: Int, b: Int): Int {
        return a + b

    }

    fun fun3(a: String) {

    }

    fun fun4(a: List<Int>): Double {
        return a.average()
    }

    fun fun5(a: String?): Int? {
        return a?.length
    }

    fun fun6(): Float? {
        return null
    }

    fun fun7(a: List<Int?>) {

    }

    fun fun8(a: Int): String? {
        return null

    }

    fun fun9(): List<String?> {
        return emptyList()

    }

    fun fun10(a: String?, b: Int?): Boolean {
        return true

    }

    fun multiplyByTwo(a: Int): Int {
        return a * 2

    }

    fun isEven(a: Int): Boolean {
        return a % 2 == 0

    }

    val n = 20
    fun printNumbersUntil(n: Int) {
        if (n < 1) {
            return

        }

        for (i in 1..n) {
            println(i)

        }

    }

    printNumbersUntil(n)

    fun findFirstNegative(a: List<Int>): Int? {
        for (number in a) {
            if (number < 0) {
                return number
            }
        }
        return null

    }


}
