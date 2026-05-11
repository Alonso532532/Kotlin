package Ejs

private data class Tarea(var titulo: String, var prioridad: Int, var completada: Boolean = false)

fun main(){
    val tareas = mutableListOf<Tarea>(
        Tarea("uno", 2),
        Tarea("dos", 1, true),
        Tarea("tres", 4, false)
    )
    println(tareas)
}