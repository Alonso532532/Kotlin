package Ejs

fun String.soloVocales(): String{
    var res = ""
    for (ch in this.toCharArray()) {
        when (ch){
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'-> res=res+ch
        }
    }
    return res
}

fun main(){
    val cad = "HolaE"
    println(cad.soloVocales())
}