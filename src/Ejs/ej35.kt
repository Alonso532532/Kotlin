package Ejs

fun comunes(uno: Array<Int>, dos: Array<Int>): MutableList<Int>{
    val repetidos = mutableListOf<Int>()
    for (i in uno) {
        if (dos.contains(i) && !repetidos.contains(i)){
            repetidos.add(i)
        }
    }
    return repetidos
}

fun main(){
    val uno = arrayOf(1,5,8,9,9)
    val dos = arrayOf(1,2,6,7,8,9,9)
    println(comunes(uno, dos))
    // O también
    println(uno.intersect(dos.toList()))
}
