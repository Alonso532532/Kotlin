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
    primos(num, num)
}

fun primos(num: Int, multi: Int): Int{
    var mult = multi-1
    if (num > 1 && mult>1){
        if (num%mult==0){
            println("No es primo")
        } else {
            primos(num, mult)
        }
    } else if (num == 1 || mult == 1){
        println("Es primo")
    } else {
        print("Es negativo")
    }
    return 0
}
