package Ejs

fun operar(a: Int, b: Int, operacion: (Int, Int) -> (Int)): Int {
    return operacion(a, b)
}

fun main(){
    while (true){
        print("¿Que quieres hacer?\n0 - Salir\n1 - Sumar\n2 - Restar\n> ")
        val op = readLine()
        when(op){
            "1", "2"->{
                var a:Int
                var b:Int;
                println("Dame 2 números")
                while (true){
                    print("1> ")
                    try {
                        a = Integer.parseInt(readLine())
                        break
                    }catch (e: NumberFormatException){
                        println("Formato inválido")
                    }
                }
                while (true){
                    print("2> ")
                    try {
                        b = Integer.parseInt(readLine())
                        break
                    }catch (e: NumberFormatException){
                        println("Formato inválido")
                    }
                }
                if (op.equals("1")){
                    println("Resultado: ${operar(a, b) { x, y -> x + y }}")
                }else{
                    println("Resultado: ${operar(a, b) { x, y -> x - y }}")
                }

            }
            "0" -> return
            else -> println("Opción inválida")
        }
    }
}