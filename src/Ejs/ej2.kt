package Ejs

fun main() {

    var num = 0;
    while (true){
        print("Numero: ")
        try {
            num = Integer.parseInt(readLine())
            break
        } catch (e: NumberFormatException){
            println("Formato inválido")
        }
    }
    println("Su factorial es: ${factorial(num)}")
}
fun factorial(a: Int): Int {
    if (a===0 || a===1){
        return 1;
    } else if (a>1){
        return a*(factorial(a-1))
    } else {
        println("El numero es negativo")
        return 0;
    }
}