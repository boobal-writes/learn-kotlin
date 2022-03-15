package com.mudivili.typeAliases

typealias StudentSet = Set<Student>

fun main() {
    StringBuilder("is a type alias.")
}

fun printStudents(students:StudentSet) {
    TODO()
}

class Student(var name: String, val id:Int)