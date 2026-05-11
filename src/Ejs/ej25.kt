package Ejs

private data class Libro(var titulo: String, var autor: String, var anio: Int)

fun main(){
    var lista = mutableListOf<Libro>(
        Libro("uno", "uno", 2007),
        Libro("dos", "dos", 2008),
        Libro("tres", "tres", 2023),
        Libro("cuatro", "cuatro", 2012)
    )
    lista.sortBy { it.anio }
    lista = lista.reversed() as MutableList<Libro>
    println(lista)
}