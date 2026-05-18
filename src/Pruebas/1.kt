package Pruebas

private open class Persona(var dni: String, var nombre: String, var edad: Int){
    open fun saludar(): String{
        return "Hola, soy ${nombre} y tengo ${edad} años"
    }
}

private class Estudiante(dni: String, nombre: String, edad: Int, var estudio: String): Persona(dni, nombre, edad) {
    override fun saludar(): String {
        return "Hola, soy ${nombre} y tengo ${edad} años y estudio en ${estudio}"
    }
}

fun main(){
    val iker = Persona("31231231G", "Lozano", 12)
    println(iker.saludar())

    val eker = Estudiante(iker.dni, iker.nombre, iker.edad, "El Chomón")
    println(eker.saludar())
}