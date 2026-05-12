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
            var op = ""
            while (true){
                print("1 - Piedra | 2 - Papel | 3 - Tijeras\n >")
                op = readLine()?: return
                if (!op.equals("1") && !op.equals("2") && !op.equals("3")){
                    break
                }
                println("Opción inválida")
            }
            var accion = (Math.random()*3+1).toString()
            when(accion){
                "1"->{
                    println("La maquina ha elegido piedra")
                    if ()
                }

            }
        }
    }
}

fun comprobar(a: Int, b: Int): Int{
     if (a == 1 && b == 3) {
        return 1
    }
}