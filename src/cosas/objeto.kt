package cosas
fun main(){
    class Persona(val nombre: String, var edad: Int)
    val persona = Persona("Stan", 2)
    persona.edad = 3
    println("Se llama ${persona.nombre} y tiene ${persona.edad} pelos")

    class Alumno(val nombre: String){
        var edad = 0
        constructor(nombre: String, edad: Int) : this(nombre) {
            this.edad = edad
        }

        override fun toString(): String {
            return "Nombre: $nombre, Edad: $edad"
        }
    }
    var alumno = Alumno("Alons")
    println(alumno)
    alumno = Alumno("Alonso", 3)
    println(alumno)

}
