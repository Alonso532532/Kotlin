package Ejs

fun main(){
    var num = 0;
    while (true){
        print("Numero\n> ")
        try {
            num = Integer.parseInt(readLine())
            break
        } catch (e: NumberFormatException){
            println("Formato inválido")
        }
    }
    if (primo(num)){
        println("Es primo")
    } else println("No es primo")
}

private fun primo(num: Int, div: Int = num-1): Boolean{
    if (div == 1) return true
    if (div<1 || num%div == 0) return false
    return primo(num, div-1)
    return true
}