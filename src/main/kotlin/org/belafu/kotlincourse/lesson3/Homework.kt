package org.belafu.kotlincourse.lesson3

val name: String = "Hackathon Survival"

var date: String = ""

val place: String = ""

var money: Int = 0
    get () = field
    set(value) {
        if (value >0) field +=value
    }

var member: Double = 16.0

const val time: Double = 3.0

val information: String = ""

lateinit var status: String

var sponsor: String = "Names"

var budget: Double = 300.00

var internet: String = "G5"

val logistic: String = ""

var teams: Int = 4
    get () = field
    set(value) {
        if (value >0) field -=value
    }

var tasks: String = ""

val evacuationplan: String = ""