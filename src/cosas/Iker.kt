package cosas

fun main(){
    print("Dame una palabra\n> ")
    var cad = readLine()!!
    var cadr = ""

    val chars = cad.toCharArray()
    // Dado la vuelta
    for (i in chars.size-1 downTo  0) {
        if (chars[i].isLetter() && chars[i].isUpperCase()){
            // Para transformarlo a minuscula
            cadr += chars[i]+32
        }else if (chars[i].isLetter()){
            cadr += chars[i]
        }
    }

    cad = ""
    // Normal
    for (i in 0 until chars.size) {
        if (chars[i].isLetter() && chars[i].isUpperCase()){
            // Para transformarlo a minuscula
            cad += chars[i]+32
        }else if (chars[i].isLetter()){
            cad += chars[i]
        }
    }
    if (cadr==cad){
        println("Es palíndroma")
    } else {
        println("No es palíndroma")
    }

}