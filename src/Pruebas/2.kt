package Pruebas

fun main(){
    val matriz = mutableListOf<List<Char>>()
    val altura = 5
    val anchura = 25
    for (i in 0..<altura){
        if (i==0 || i==altura-1) matriz.add(List(anchura){'*'})
        else {
            val temp = MutableList(anchura){' '}
            for (b in 0..<temp.size){
                if (b==0 || b==temp.size-1) temp[b] = '*'
            }
            matriz.add(temp)
        }
    }

    matriz.forEach {
        it.forEach { print(it) }
        println()
    }
}