package org.belafu.kotlincourse.lesson8

fun main () {


println(former("Произошла катастрофа на сервере"))
    cardnumber("")
    println(adress(email))
    println(abb)
}


fun former (text: String): String {
    return when {
        (text.contains("невозможно")) -> text.replace("невозможно", "совершенно точно возможно, просто требует времени")
        (text.startsWith("Я не уверен", true)) -> "$text, но моя интуиция говорит об обратном"
        (text.contains("катастрофа")) -> text.replace("катастрофа", "интересное событие")
        (text.endsWith("без проблем")) -> text.replace("без проблем", "с парой интересных вызовов на пути")
        (text.contains(" ") == false) -> "Иногда $text, но не всегда"

        else -> "Это невозможно выполнить за один день"

    }



}

fun Logi(Login: String) {

    val Login = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val firstindex = Login.indexOf(">") +2
    val secondindex = Login.substring(firstindex + 2)

    val dateAndTimeSplit = secondindex.split(" ")
    val date = dateAndTimeSplit[0]
    val time = dateAndTimeSplit[1]

   println("Дата: $date   Время: $time")


    }


fun cardnumber (Number: String) {
    val originalnymber = "4539 1488 0343 6467"
    val subnumber = originalnymber.substring(14, 19)

    println("**** **** **** $subnumber")


}
val email = "username@example.com"

fun adress (mail: String): String {
    return mail
        .replace("@", " [at] ") .replace(".", " [dot] ")



}

val phrase = "Объектно-ориентированное программирование"
val abb = Abbr(phrase)

fun Abbr(phrase: String): String {
    val words = phrase.split(" ", "-")
    var w = ""

    for (word in words) {
        if (word.isNotEmpty()) {
            w += word[0].uppercaseChar()
        }
    }

    return w
}








