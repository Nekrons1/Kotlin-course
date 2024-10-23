package org.belafu.kotlincourse.lesson13

fun main () {

    val list = listOf(56, 7, 4, -5, 10, 12, 78, 101, 6, 23)

    fun returnlist(numbers: Collection<Int>): String {
        return when {
            numbers.isEmpty() -> "Пусто"
            numbers.size < 5 -> "Короткая"
            numbers.firstOrNull() == 0 -> "Стартовая"
            numbers.sum() > 10000 -> "Массивная"
            numbers.average() == 10.0 -> "Сбалансированная"
            numbers.joinToString("").length == 20 -> "Клейкая"
            numbers.maxOrNull() ?: 0 < -10 -> "Отрицательная"
            numbers.minOrNull() ?: 0 > 1000 -> "Положительная"
            numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
            else -> "Уникальная"
        }
        val result = returnlist(list)
        println(result)

    }
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val bigerthan = grades.filter { it > 60 }

    val sort = bigerthan.sorted()

    val takeitthree = sort.take(3)
    println(takeitthree)


    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val disct = numbers.distinct()

    val lover = disct.sortedDescending()

    val even = lover.filter { it % 2 == 0 }
    println(even)

    val odd = lover.filter { it % 2 != 0 }
    println(odd)



    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    val notnulll = ages.filterNotNull().firstOrNull { it > 18 }


    val findage = notnulll?.toString() ?: "Подходящий возраст не найден"

    println(findage)



}





