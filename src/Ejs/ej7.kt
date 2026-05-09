package Ejs

fun main(){
    val cadenas = mutableListOf<String>()
    while (true) {
        print("Esctibe textos (x - para terminar)\n> ")
        val cad = readLine()

        if (cad.equals("x") || cad.equals("X")) break
        cadenas.add(cad?: continue)
    }

    var cambios = 1
    while (cambios>0){
        cambios = 0
        var i = 0
        while (i < cadenas.size-1){
            if (cadenas[i].length<cadenas[i+1].length){
                val cad = cadenas[i]
                cadenas[i] = cadenas[i+1]
                cadenas[i+1] = cad
                cambios++;
            }
            i++
        }
    }
    var pos = 1
    cadenas.forEach { println("${pos++} - ${it}") }
}