package org.belafu.kotlincourse.lesson7

class Homework {
}

fun main() {

    for (i in 1 .. 5)
        println(i)

    for (e in 1..10) {
        if (e == 1) continue
        if (e == 3) continue
        if (e == 5) continue
        if (e == 7) continue
        if (e == 9) continue
        println(e)

    for (w in 5 downTo 1) {
        println(w)
    }

        for (d in 1..12) {
            println(d-2)
        }

        for (r in 1..9 step 2)
            println(r)

        for (y in 1..20 step 3) {
            if (y == 1) continue
            println(y-1)


        for (u in 1 until 9)
            println(u)

        for (s in 3 until 15)
            println(s)

        var w = 1
        while (w <=5) {
            println(w * w)
            w++
        }

        var q = 10
        while (q >= 5) {
            println(q)
            q--
        }

        var counter = 5
        do {
            println(counter)
            counter++
        } while (counter < 10)


        for (h in 1..10) {
            if (h == 6) break
            println(h)
        }

       var j = 0
       while (j >= 0) {
           println(j)
           j++
           if (j == 10) break
       }

       for (k in 1..10) {
           for (p in 1..10) {
               println(k*p)
               println("  ")
           }
           println( )
       }

    }}}

