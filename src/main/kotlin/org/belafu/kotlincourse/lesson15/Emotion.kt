package org.belafu.kotlincourse.lesson15

class Emotion(val type: String, val intensity: Int) {

    fun express() {
        val intensityDescription = when (intensity) {
            in 1..3 -> "Слабая"
            in 4..6 -> "Необычная (зачёркнуто), средняя"
            in 7..9 -> "Редкая (зачёркнуто), сильная"
            10 -> "Легендарная"
            else -> "Мифик наверное"
        }

        println("Эмоция: $type, Интенсивность: $intensity ($intensityDescription)")
    }
}