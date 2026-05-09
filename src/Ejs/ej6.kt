package Ejs

fun main(){
    val letras = mutableMapOf<Char, Int>()
    print("Dame una palabra\n> ")
    val palabra = readLine();
    palabra?.trim()?.toCharArray()?.forEach { a->
            letras.put(a, letras.get(a)?.plus(1) ?: 1)
    }
    letras.forEach { a->
            println("${a.key} - ${a.value}")
    }
}