package Ejs

fun main(){
    val lista = listOf(1,2,3,4,5,2,3)
    val duplicados: (List<Int>) -> List<Int> = { lista ->
        lista
            .groupingBy { it }
            .eachCount()
            .filter { it.value > 1 }
            .keys
            .toList()
    }
    println(duplicados(lista))
}