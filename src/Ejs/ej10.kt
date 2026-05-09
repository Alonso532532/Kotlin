package Ejs

fun main(){
    print("Dame un texto\n> ")
    val cad = readLine()?: return
    var cadR = ""
    cad.toCharArray().forEach { a->
        cadR = a+cadR
    }
    println(cadR)
}