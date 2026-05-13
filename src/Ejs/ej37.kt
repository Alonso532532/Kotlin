package Ejs

fun main(){
    while (true){
        print("ENTER para empezar partida (\"s\" para salir)\n> ")
        if (readLine().equals("s")){
            return
        }
        var p1 = 0;
        var p2 = 0;
        while (p1 < 3 && p2 < 3){
            println("=================================================================")
            var op: String
            while (true){
                print("1 - Piedra | 2 - Papel | 3 - Tijeras\n Marcador ${p1} - ${p2}\n> ")
                op = readLine()?: return
                if (op.equals("1") || op.equals("2") || op.equals("3")){
                    break
                }
                println("Opción inválida")
            }
            var accion = (Math.random()*3+1).toInt().toString()
            when(accion){
                "1"->{
                    println("La maquina ha elegido piedra")
                }
                "2"->{
                    println("La maquina ha elegido papel")
                }
                "3"->{
                    println("La maquina ha elegido tijeras")
                }
            }
            Thread.sleep(1000)
            val res = comprobar(op, accion)
            if (res == 1){
                println("Has ganado 1 punto")
                p1++
            } else if (res == 0){
                println("Empate")
            } else {
                println("La maquina gana un punto")
                p2++
            }
            Thread.sleep(2000)
        }
        Thread.sleep(2000)
        if (p1 == 3){
            println("Has ganado")
        } else {
            println("Ha ganado la maquina")
        }
        println("Partida terminada")
        Thread.sleep(1000)
    }
}

fun comprobar(a: String, b: String): Int{
     if ((a == "1" && b == "3")||(a == "2" && b == "1")||(a == "3" && b == "2")) {
         return 1
     }else if (a!=b){
         return -1
     }
    return 0
}