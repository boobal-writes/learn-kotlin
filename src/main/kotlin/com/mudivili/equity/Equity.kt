package com.mudivili.equity

fun main() {
    val one = Doctor("Krishiv", 1)
    val referentialOne = one
    val equalOne = Doctor("Krishiv", 1)
    val notEqualOne = Doctor("Boobalan", 2)

    println(one === referentialOne)
    println(one == equalOne)
    println(one != notEqualOne)
    println(one !== equalOne)
}

class Doctor(var name: String, val id: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj is Doctor)
            return obj.name == this.name &&
                    obj.id == this.id
        return false;
    }
}