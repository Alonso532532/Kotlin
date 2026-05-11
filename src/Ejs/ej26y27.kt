package Ejs
private class Cuenta(var saldo: Double){

    fun depositar(cantidad: Double){
        saldo += cantidad
    }

    fun retirar(cantidad: Double){
        if (cantidad<saldo) {
            saldo -= cantidad
        } else {
            throw IllegalArgumentException("El saldo es insuficiente para realizar la operación")
        }
    }

    fun consultar(): Double{
        return saldo
    }
}

fun main(){
    val cuenta = Cuenta(20.0)
    println(cuenta.consultar())
    cuenta.depositar(10.25)
    println(cuenta.consultar())
    try {
        cuenta.retirar(50.0)
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

    println(cuenta.consultar())
}