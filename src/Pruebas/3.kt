package Pruebas

fun main(){
    val lista = mutableListOf<Int>()
    for (i in 1..1000){
        var acum = 0
        for(b in 1..<i){
            if (i%b == 0) acum += b
        }
        if (acum == i) lista.add(i)
    }

    lista.forEach { println(it) }
}