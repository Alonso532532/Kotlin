package Ejs

fun main(){
    print("Dame un texto\n> ")
    val cad = readLine()!!

    var cadR = ""
    cad.toCharArray().forEach { a->
        cadR = a+cadR
    }

//    var cadR2 = ""
//    var cont = 0
//    for (ch in cad.length-1 downTo 0) {
//        cadR2 = cadR2+cad[ch]
//    }
    println(cadR)
}