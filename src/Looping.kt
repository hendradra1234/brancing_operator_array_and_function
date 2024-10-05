package com.looping
//class Looping {
//}

fun simpleFor () {
    for ( i in 1..15)
        println("Iteration $i ")
    println("DONE")
}

fun nestedFor () {
    for( i in 1..5) {
        for (j in 1..i)
            print("$j ")
        println()
    }
    println("DONE")
}

fun whileLoop () {
    var i = 1
    while ( i <= 10) {
        println("While Loop Iteration $i")
        i++
    }
    println("DONE")
}

fun doWhileLoop () {
    var i = 1
    do {
        println("Do While Loop Iteration $i")
        i++
    } while ( i <= 10)
    println("DONE")
}

fun repeeatLoop () {
    repeat(5) {
        println("Repeating Loop Iteration $it")
    }
    println("DONE")
}