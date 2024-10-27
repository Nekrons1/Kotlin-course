package org.belafu.kotlincourse.lesson15

class Concert(
    val band: String,
    val venue: String,
    val price: Double,
    val capacity: Int
) {
    private var ticketsSold: Int = 0

    fun concertInfo() {
        println("Группа: $band")
        println("Место проведения: $venue")
        println("Стоимость билета: $$price")
        println("Вместимость зала: $capacity")
        println("Проданные билеты: $ticketsSold")
    }

    fun buyTicket() {
        ticketsSold++
        println(ticketsSold)
    }
}