package Ejs

data class Estudiante(var nombre: String, var nota: Double, var aprobado: Boolean){
    override fun toString(): String {
        return "| Nombre: ${nombre} | Nota: ${nota} | Aprobado: ${aprobado} |\n"
    }
}

fun main(){
    val lista = mutableListOf<Estudiante>()
    while (true){
        lista.forEach { print(it) }
        print("\nElige una opción\n1 - Añadir\n2 - Borrar\n3 - Modificar\nS - Salir\n> ")
        val op = readLine()
        when(op){
            "s","S"->return

            "1"->{
                println("=====================================")
                print("Nombre\n> ")
                val nombre = readLine()?: return

                var nota = 0.0
                while (true){
                    print("Nota\n> ")
                    try {
                        nota = (readLine()?: return).toDouble()
                        if (nota>10 || nota<0){
                            println("La nota no puede ser superior a 10 o negativa")
                        }else break
                    }catch (e: NumberFormatException){
                        println("Formato inválido")
                    }
                }

                var aprobado = "n"
                while (true){
                    print("Aprobado S/N\n> ")
                    val siNo = readLine()
                    if (siNo == "s" || siNo == "S"){
                        aprobado="s"
                        break
                    } else if (siNo == "n" || siNo == "N"){
                        aprobado="n"
                        break
                    }else{
                        println("Formato inválido")
                    }
                }
                lista.add(Estudiante(nombre, nota, aprobado=="s"))
            }

            "2"->{
                println("=====================================\n")
                if (lista.isNotEmpty()) {
                    while (true) {
                        lista.forEachIndexed { index, estudiante -> print("${index + 1} - $estudiante\n") }
                        println()
                        print("¿Cual quieres elminar?\n> ")
                        val pos = (readLine() ?: return).toInt()
                        if (lista.size < pos || pos < 1) {
                            println("Posición incorrecta")
                            continue
                        }
                        lista.removeAt(pos - 1)
                        break
                    }
                }else{
                    println("La lista no tiene elemntos que eliminar")
                }
            }

            "3"->{
                println("=====================================\n")
                if (lista.isNotEmpty()) {
                    while (true) {
                        lista.forEachIndexed { index, estudiante -> print("${index + 1} - $estudiante\n") }
                        println()
                        print("¿Cual quieres modificar?\n> ")
                        val pos = (readLine() ?: return).toInt()
                        if (lista.size < pos || pos < 1) {
                            println("Posición incorrecta")
                            continue
                        }
                        lista.removeAt(pos - 1)
                        break
                    }
                }else{
                    println("La lista no tiene elemntos que eliminar")
                }
            }

            else -> println("Opción invalida")
        }
    }
}