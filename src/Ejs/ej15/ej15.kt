package Ejs.ej15

fun main(){
    val circulo = Circulo()
    circulo.radio = 2.3

    val cuadrado = Cuadrado()
    cuadrado.lado = 3.0

    println(circulo.area())
    println(cuadrado.area())
    println(Math.PI)
}