package org.belafu.kotlincourse.lesson10

fun main () {


    val arraynull: Array<Int?> = arrayOfNulls(5)
   arraynull[0] = 1
    for (i in arraynull.indices) {
        arraynull[i] = i + 1
    }

    println(arraynull.toList())


    val str: Array<String?> = arrayOfNulls(10)

    val arraydouble: Array<Double?> = arrayOfNulls(5)
    for (i in arraydouble.indices) {
        arraydouble[i] = (i * 2.0)
    }

    println(arraydouble.toList())

    val arrayint: Array<Int?> = arrayOfNulls(5)
    for (i in arrayint.indices) {
        arrayint[i] = i * 3
    }

    println(arrayint.toList())

    val arrayany: Array<String?> = arrayOfNulls(3)
    for (i in arrayany.indices) {
        if (i == 0) arrayany[i] = null
        else arrayany [i] = ""
    }

    println(arrayany.toList())
}