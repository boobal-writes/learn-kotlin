package com.mudivili.stringTemplate

fun main() {
    val velpaari = Book("Velpaari", 9.0F)
    println(velpaari)
    println("$ is symbol of USD")
    println("$, € are symbols of currencies")
    println("Price can be printed using \$price")
    println("Velpaari book's price is $${velpaari.price}")
    println("Velpaari book's price on Diwali's discount(10%) is $${velpaari.price * 90 / 100}")
}

class Book(private val name: String, val price: Float) {
    override fun toString(): String {
        return "Book(name= $name, price= $$price)"
    }
}