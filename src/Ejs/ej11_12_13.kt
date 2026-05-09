package Ejs
data class producto(var nombre: String, var precio: Double, var cant: Int )

fun main(){
    val productos = listOf(
        producto("Ratón", 12.0, 4),
        producto("Teclado", 24.0, 12),
        producto("Monitor", 56.0, 0)
    )
    productos.filter { a->a.cant>0 }.forEach { println(it) }
    println("Precio total: ${productos.filter { a->a.cant>0 }.sumOf { a->a.precio }}")

}