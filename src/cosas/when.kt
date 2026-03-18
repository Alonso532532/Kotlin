package cosas

fun main(){
    val i = readLine()
    val b = i?.toInt()
    when(b){
        1-> println("uno")
        2-> println("dos")
        3-> println("tres")
        else -> println("Cualquier otro")
    }
}
