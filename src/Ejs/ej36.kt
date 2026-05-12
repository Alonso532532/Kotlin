package Ejs

class Agenda(val lista: MutableMap<String, Int> = mutableMapOf()){
    fun buscarPorNombre(nom: String): String {
        if (lista[nom] == null){
            return "No existe"
        }
        return lista[nom].toString()
    }
}

fun main(){
    val ag = Agenda()
    ag.lista.putAll(mapOf(
        "Iker" to 2123,
        "Pablo" to 3123,
        "Hecprooll" to 4234
    ))

    val ag2 = Agenda( mutableMapOf(
        "iker" to 3232,
        "Pablo" to 4223
        )
    )
    println(ag.buscarPorNombre("Ike"))
    println(ag2.buscarPorNombre("iker"))
}