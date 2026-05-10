package Ejs.ej15

class Circulo: Figura {
    var radio = 0.0

    override fun area(): Double {
        return Math.PI*radio*radio
    }
}