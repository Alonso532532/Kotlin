package Ejs

import java.util.regex.Matcher

fun main(){
    val texto = "Hola hecproll gitanico\nde mercadico"
    val regex = Regex("\\w+")
    println(regex.findAll(texto).toList().size)

}