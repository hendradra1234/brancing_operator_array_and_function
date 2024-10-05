package com.branching
//class Branching {
//}

fun ifThen () {
    val angka: Int;
    print("Input sebuah angka: ");
    angka = readLine()!!.toInt();
    if (angka > 5)
        println("Angka yang di input > 5")
    println("DONE")
}

fun ifThenElse () {
    val angka: Int;
    print("Input sebuah angka: ");
    angka = readLine()!!.toInt();

    if (angka > 5)
        println("Angka yang di input > 5")
    else
        println("Angka yang di input <= 5")
    println("DONE")
}

fun nestedIf () {
    val angka: Int;
    print("Input sebuah angka: ");
    angka = readLine()!!.toInt();

    if (angka > 10 && angka <= 20)
        println("Angka yang di input > 10 dan <= 20")
    else if (angka >= 0 && angka <= 10)
        println("Angka yang di input antara 0 sampai 10")
    else
        println("Angka yang di input tidak sesuai kriteria")
    println("DONE")
}

fun multiWayConditionalBranch () {
    // Switch Operator
    val dayCode: Int;

    print("Input kode hari (1 s/d 7): ");
    dayCode = readLine()!!.toInt();
    when(dayCode) {
        1-> println("Hari Senin")
        2-> println("Hari Selasa")
        3-> println("Hari Rabu")
        4-> println("Hari Kamis")
        5-> println("Hari Jumat")
        6-> println("Hari Sabutu")
        7-> println("Hari Minggu")
        else-> println("Input Invalid, masukkan 1 - 7")
    }

}