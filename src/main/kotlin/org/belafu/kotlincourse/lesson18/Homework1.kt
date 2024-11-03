package org.belafu.kotlincourse.lesson18

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())

    for (animal in animals) {
        animal.makeSound()
    }

    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0)
    )


    for (shape in shapes) {
        println(shape.area())
    }

    val cart = ShoppingCart()

    cart.addToCart(101)

    cart.addToCart(mapOf(102 to 3, 103 to 2))

    cart.printCart()
}

open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[34mBark\u001B[0m")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[33mMeow\u001B[0m")
    }
}


class Bird : Animal() {
    override fun makeSound() {
        println("\u001B[32mTweet\u001B[0m")
    }
}


abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}


class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return radius * radius * 3.14
    }
}


class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}


class Triangle(private val sideA: Double, private val sideB: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * sideA * sideB
    }
}

class ShoppingCart {
    private val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    fun addToCart(itemMap: Map<Int, Int>) {
        for ((itemId, amount) in itemMap) {
            items[itemId] = (items[itemId] ?: 0) + amount
        }
    }

    fun printCart() {
        for ((itemId, quantity) in items) {
            println("Товар $itemId: $quantity шт.")
        }
    }
}
