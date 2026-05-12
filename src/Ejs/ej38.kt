package Ejs

import kotlin.math.min

fun convertir(mins: Int): String{
    return (mins/60).toString()+":"+(mins%60).toString()
}

fun main(){
    var mins = 0
    while (true){
        print("Cunatos minutos\n> ")
        try {
            mins = (readLine()?: return).toInt()
            break
        } catch (e: NumberFormatException){
            println("Formato inválido")
        }
    }
    println(convertir(mins))
}