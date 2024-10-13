package org.belafu.kotlincourse.lesson12

fun main () {

    fun drawRectangle(width: Int, height: Int) {
        if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
        if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

        // Верхняя граница
        var topLine = "+"
        for (i in 1 until width - 1) {
            topLine += "-"
        }
        topLine += "+\n"
        print(topLine)

        // Боковые границы
        for (i in 1 until height - 1) {
            var middleLine = "|"
            for (j in 1 until width - 1) {

            }

            }}

}