package com.functionAndProcedure
//class FunctionAndProcedure {
//
//}
fun hitluas(p: Int, l: Int): Int = p * l
fun cetak () = println("\n...Ini adalah prosedur....\n")
fun outDisplay (message: String, output: Int) = println("$message: $output")

fun funcHitLuas () {
    var pjg: Int = 0
    var lbr: Int = 0
    var luas: Int = 0

    print("Input Panjang: ")
    pjg = readLine()!!.toInt()
    print("Input Lebar: ")
    lbr = readLine()!!.toInt()
    luas = hitluas(pjg, lbr)

    outDisplay("\nLuas Persegi Panjang", luas)
    cetak()
}

