package Ejs

fun main(){
    var num: Int
    while (true){
        print("Numero\n> ")
        try {
            num = Integer.parseInt(readLine())
            break
        } catch (e: NumberFormatException){
            println("Formato inválido")
        }
    }
    var resul = ""
    while (num>0){
        println(num%2)
        println(num)
        resul = resul+num%2
        num=num/2;

    }
    resul = resul.reversed()
    println(resul)
}