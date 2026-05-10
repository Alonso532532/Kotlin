package Ejs.ej15

class Cuadrado(): Figura{
    var lado = 0.0

    override fun area(): Double {
        return lado*lado
    }
}