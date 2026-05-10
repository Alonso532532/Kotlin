package Ejs

import java.time.LocalDate

fun main(){
    val personas = mutableMapOf<String, LocalDate>(
        "Iker" to LocalDate.parse("2019-02-20"),
        "Hecproll" to LocalDate.parse("2020-02-20"),
        "Pablo" to LocalDate.parse("2020-02-25")
    )
    println(personas.maxBy { a->a.value }.key)

}