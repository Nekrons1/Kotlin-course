package org.belafu.kotlincourse.lesson14

fun main () {


    val test = mapOf("test1" to 6, "test2" to 10, "test3" to 12)
    val averageTime = test.values.average()
    println(averageTime)


    val test2 = mapOf("test1" to "1", "test2" to "2", "test3" to "3")
    val meth = test2.keys
    println(meth)

    val test3 = mutableMapOf("test1 " to " Прошёл", "test2 " to " Нет")
    test3["test3 "] = " Прошёл"
    println(test3)


    val test4 = test3.count { it.value == " Прошёл" }
    println(test4)


    val bug = mutableMapOf("bug1" to "Есть", "bug2" to "Исправлен")
    bug.remove("bug2")
    println(bug)

    val test5 = mapOf("Kotlincourse.com" to "contact", "Twitter.com" to "404 Not Found")
    test5.forEach { (url, status) -> println("Страница: $url, Статус: $status")}


    val response = mapOf("1" to 100, "2" to 103, "3" to 2578)
    val track = 200
    val test6 = response.filter { it.value > track }
    println("$track: $test6")

    val config = mapOf("browserType" to "Chrome")
    val browserType = config["browserType"] ?: error("Ошибка")
    println(browserType)

    val version = mapOf("vers1" to "v1.0", "vers2" to "v1.35342")
    val newVesrion = version.toMutableMap()
    newVesrion["vers3"] = "v1.2"
    println(newVesrion)


    val test7 = mapOf("module1" to "Да", "module2" to "Нет", "module3" to "Да")
    val pass = test7.containsValue("Нет")
    println(pass)




}