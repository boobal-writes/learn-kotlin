package com.mudivili.dataTypes

import com.mudivili.dummy.DummyClass

fun main() {
    val myInt = 10
    var myLong = 1234567890L
    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short = 1234
    myShort = myByte.toShort()

    var myFloat = 9876.5F
    var myDouble = 1234.56
    myDouble = myFloat.toDouble()

    var char = 'B'
    char = 65.toChar()

    val vacationTime = true
    println(DummyClass().isVacationTime(vacationTime))

    val anything: Any
}

fun returnUnitOne(): Unit {
    return
}

fun returnUnitTwo() = Unit

fun returnNothing(): Nothing {
    while (true) {

    }
}