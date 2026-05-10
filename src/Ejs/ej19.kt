package Ejs

fun procesarLista(
    lista: List<Int>,
    filtro: (Int) -> Boolean,
    transformacion: (Int) -> Int
): List<Int> {

    return lista
        .filter(filtro)
        .map(transformacion)
}

fun main() {

    val numeros = listOf(1, 2, 3, 4, 5, 6)

    val resultado = procesarLista(
        numeros,
        { it % 2 == 0 },   // filtro: pares
        { it * 10 }        // transformación
    )

    println(resultado)
}