package com.mudivili.declarations

fun main() {
    val numberOne = 15
    val numberTwo: Int
    numberTwo = 20
    val numberThree: Short = 10
    var numberFour = 25
    numberFour = 30

    val condition = true

    val employeeOne = Employee("Devameena", 10)
    employeeOne.name = "Devameena Boobalan"

    val employeeTwo: Employee
    if (condition) {
        employeeTwo = Employee("Boobalan", 15)
    } else {
        employeeTwo = Employee("Krishiv", 15)
    }
}

class Employee(var name: String, val id: Int)