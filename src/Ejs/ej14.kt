package Ejs
class Empleado(var nombre: String, var edad: Int){
    fun jubilación() : Int{
        if (edad>65){
            return 0
        }
        return 65-edad
    }
}

fun main(){
    val empleado = Empleado("Iker", 34)
    println(empleado.jubilación())
}