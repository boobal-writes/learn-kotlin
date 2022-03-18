package com.mudivili.smartCast

fun main() {
    val order = Order(1)

    val something: Any = order

    if(something is Order) {
        println(something.number)
    }
}

class Order(val number: Int)