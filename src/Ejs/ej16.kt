package Ejs

import kotlin.math.cos


fun main(){
    var cosa: Any
    cosa = true
    when (cosa) {
        is Int -> println("Es un entero")
        is Double -> println("Es un decimal")
        is Char -> println("Es un carácter")
        is String -> println("Es una cadena")
        else -> println("Tipo desconocido")
    }
}