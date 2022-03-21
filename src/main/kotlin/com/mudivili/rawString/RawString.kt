package com.mudivili.rawString

fun main() {
    val directoryPath = """/home/users/boobalan/"""
    println(directoryPath)

    var jsonString = """{
    "isEnabled": "true"
}"""
    println(jsonString)

    jsonString = """{
        |   "isEnabled": "true"
        |}""".trimMargin()
    println(jsonString)
}