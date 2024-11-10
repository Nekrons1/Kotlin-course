package org.belafu.kotlincourse.lesson19

class Arcade(
    val color: String,
    val model: String,
    private val owner: String,
    private val support: String
) {
    private var on: Boolean = false
    private var loaded: Boolean = false
    private var availableGames: List<String> = listOf("1", "1", "0")
    private var hasJoystick: Boolean = true
    private var balance: Double = 0.0


    fun powerOn(): Boolean {
        println("1")
        return true
    }

    fun powerOff(): Boolean {
        println("1")
        return true
    }

    fun shutdown(): Boolean {
        return true
    }

    fun showAvailableGames(): List<String> {
        return listOf("1", "1", "0")
    }


    fun startGame(game: String): String {
        return "1"
    }

    fun pay(amount: Double): String {
        return "1"
    }


    private fun withdraw(): Double {
        return 7.0
    }

    fun prize(prizeAmount: Double): String {
        return "2"
    }

}