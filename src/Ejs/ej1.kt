package Ejs

fun main(){
    var uno = 0;
    while (true) {
        print("Primero: ")
        try {
            uno = Integer.parseInt(readLine())
            break
        } catch (e: NumberFormatException) {
            println("Formato inválido")
        }
    }

    var dos = 0;
    while (true) {
        print("Segundo: ")
        try {
            dos = Integer.parseInt(readLine())
            break
        } catch (e: NumberFormatException) {
            println("Formato inválido")
        }
    }

    if (uno>dos){
        println("El primero es mayor que el segundo")
    } else {
        println("El segundo es mayor que el primero")
    }
}