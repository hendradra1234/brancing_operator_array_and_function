package com.arrays
//class Arrays {
//}

fun array1D () {
    val array = IntArray(5)
    array[0] = 1
    array[1] = 2
    array[2] = 3
    array[3] = 4
    array[4] = 5

    println("Isi Array 1D")

    for (i in 1..4) {
        println("Isi Array index ke: $i: ${array[i]}")
    }
}

fun array2D () {
    val array: Array<IntArray> = Array(2) { IntArray(3) }

    array[0][0] = 1
    array[0][1] = 3
    array[1][0] = 5
    array[1][1] = 8
    array[1][2] = 9

    for (i in array.indices) {
        for (j in array[0].indices) {
            println(array[i][j])
        }
        println()
    }
}

fun arrayIteration () {
    val arr = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80)
    var i = 0
    for (number in arr) {
        println("isi Array ke $i: $number")
        i++
    }
}