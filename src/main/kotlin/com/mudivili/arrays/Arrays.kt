package com.mudivili.arrays

import com.mudivili.dummy.DummyClass
import java.math.BigDecimal
import java.math.BigDecimal.*

fun main() {
    val names = arrayOf("Boobalan", "Krishiv", "Sathish")

    var numbersOfLong = arrayOf(1L, 2L, 3L)
    numbersOfLong = arrayOf<Long>(1, 2, 3)
    println("numbersOfLong[1] is ${numbersOfLong[1]}")

    var numbers: Array<Int>
    numbers = arrayOf(1, 2, 3, 4, 5)
    numbers = Array(5) { i -> i * 2 }
    println("First five even numbers ${numbers.joinToString()}")
    numbers = Array(5) { 0 }
    println("All zeros ${numbers.joinToString()}")
    numbers = Array(5) { i -> i + 1 }
    println("One to five ${numbers.joinToString()}")
    numbers = Array(5) { i -> (i + 1) * 10 }
    println("Ten to fifty ${numbers.joinToString()}")

    val hundreds = arrayOf("Hundred", 100, TEN.multiply(TEN), 100.toChar())
    for (hundred in hundreds) {
        println(hundred)
    }

    var numbersOfInteger: IntArray
    numbersOfInteger = IntArray(5)
    println("IntArray of size five initialized as ${numbersOfInteger.joinToString()}")
    numbersOfInteger = intArrayOf(1, 2, 3, 4, 5)
    DummyClass().printNumbers(numbersOfInteger)

    numbersOfInteger = numbers.toIntArray()
    numbers = numbersOfInteger.toTypedArray()
}