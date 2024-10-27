package org.belafu.kotlincourse.lesson15

object Moon {
    var isVisible: Boolean = false
    var phase: String = "Full moon"

    fun showPhase() {
        if (isVisible) {
            println(phase)
        } else {
            println("New moon")
        }
    }
}