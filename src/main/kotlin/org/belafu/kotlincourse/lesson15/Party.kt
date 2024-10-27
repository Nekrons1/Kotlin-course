package org.belafu.kotlincourse.lesson15

class Party(val location: String, val attendees: Int) {

    fun details() {
        println("Место проведения: $location")
        println("Количество гостей: $attendees")
    }
}