package Ejs

import kotlin.math.roundToInt

fun main(){
    var cont = 0
    while (true){
        val dado1 = (Math.random() * 6).roundToInt()
        val dado2 = (Math.random() * 6).roundToInt()
        cont++
        println("${dado1} - ${dado2}")
        if (dado1 == 6 && dado2 == 6) {
            println("Apañao en ${cont} intentos")
            break
        }
    }

}