package Ejs

fun main() {
    print("Dame una palabra: ")
    var palabra = readLine()

    if (palabra==palabra?.reversed()){
        println("La palabra es polindroma")
    } else {
        println("La palabra no es polindroma")
    }
}