package org.belafu.kotlincourse.lesson9

fun main () {

    val name = "Александр"
    val age: Int? = 25

    if (age != null) {
        celebrateBirthday(name, age)
    } else {
        println("Возраст не указан.")
    }
}

fun celebrateBirthday(name: String, age: Int) {
    println("$name!")
    println("С днём рождения! 🎉")

    val wishes = listOf(
        "грамотного долгосрочного планирования!",
        "адекватных дэдлайнов!",
        "сил на любимые дела!",
        "счастья, здоровья"
    )

    val selectedWish = if (age < 18) {
        wishes[0]
    } else if (age in 18..30) {
        wishes[1]
    } else if (age in 31..50) {
        wishes[2]
    } else {
        wishes[3]
    }

    println("Желаю $selectedWish")
}