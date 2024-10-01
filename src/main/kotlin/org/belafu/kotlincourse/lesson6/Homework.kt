package org.belafu.kotlincourse.lesson6

import java.lang.Character.UnicodeScript

fun main ()  {
println(season(month.toByte())) // Не совсем понял почему тут to Byte добавилось, но программа сама его вставила обозначая отсуствие как ошибку.
    println(move(length))
    println(dogage(age))
    println(score(scrip))
    println(type(filet))
    println(temp(weather))
    println(kage(kidsage))

}

val month = 6
fun season (month: Byte): String {
    return if (month > 12 || month < 0) "Неверное значение"
    else if (month in 1..2) "Зима"
    else if (month in 3..5) "Весна"
    else if (month in 6..8) "Лето"
    else if (month in 9..11) "Осень"
    else "Зима"
}

val length = 967
fun move (length: Int): String {
    return if (length < 0) "Неверное значение"
    else if (length <= 1000) "Пешком"
    else if (length in 1001..2000) "Велосипед"
    else "Автотранспорт"
}

val age = 6.0
fun dogage (age: Double): Double {
   return if (age in 0.0..2.0) age * 10.5
    else (age - 2) * 4 + 21
}

val scrip = 1301
fun score (scrip: Int): Any {
return if (scrip <= 99) "0"
    else if (scrip in 100..1000) scrip / 100 * 2
    else ((scrip -1000) / 100 * 5 +20)
}


val filet = "png"
fun type (filet: String): String {
    return if (filet == "txt") "Текстовый документ"
    else if (filet == "png") "Изображение"
    else if (filet == "exel") "Таблица"
    else "Неизвестный тип"
}

val weather = 27
fun temp (weather: Int): String {
    return if (weather in -29..-1) "Куртка и шапка"
    else if (weather in -0..15) "Ветровка"
   else if (weather in 16..35) "Футболка и Шорты"
    else "Рекомендуется не выходить из дома"
}

val kidsage = 6
fun kage (kidsage: Int): String {
    return if (kidsage < 0) "Неверное значение"
    else if  (kidsage in 0..6) "Детские"
    else if (kidsage in 7..16) "Подростковые"
    else "18+"
}