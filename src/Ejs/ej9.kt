package Ejs

import kotlin.math.sin

fun main(){
    val cads = mutableListOf<String>()
    while (true) {
        print("Esctibe textos (x - para terminar)\n> ")
        val cad = readLine()?: return

        if (cad.equals("x") || cad.equals("X")) break
        cads.add(cad?: continue)
    }
    val sinRepetidos = mutableListOf<String>()
    cads.forEach { a->
        if (!sinRepetidos.contains(a)){
            sinRepetidos.add(a)
        }
    }
    for (i in sinRepetidos){
        println(i)
    }
}