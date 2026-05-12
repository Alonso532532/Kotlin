package Ejs

fun main(){
    val listaCoordenadas = mutableListOf<Pair<Double, Double>>()
    listaCoordenadas.add(Pair(23.7, 23.4))
    listaCoordenadas.add(Pair(25.4, 53.5))
    listaCoordenadas.add(Pair(64.6, 73.8))
    listaCoordenadas.add(Pair(53.45, 13.4))

    listaCoordenadas.addAll( listOf(
        Pair(23.7, 23.4),
        Pair(25.4, 53.5),
        Pair(64.6, 73.8),
        Pair(53.45, 13.4)
    ))
    listaCoordenadas.forEach { print(it) }
}