package Ejs

fun main(){
    val numeros = arrayOf(1,2,3,4,5,3,5,2,3,5,1,2,3,2)
    val veces = mutableMapOf<Int, Int>()

    for (i in numeros) {
        if (veces.get(i) != null){
            veces.put(i, (veces.get(i)?: return)+1)
        } else {
            veces.put(i, 0)
        }
    }

    println("Moda: "+veces.maxBy { it.value }.key)
}