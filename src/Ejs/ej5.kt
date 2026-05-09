package Ejs

fun main(){
    val nums = mutableListOf<Int>()
    while (true){
        print("Dame numeros (letra para terminar)\n> ")
        try {
            nums.add(Integer.parseInt(readLine()))
        } catch (e: NumberFormatException){
            break
        }
    }
    val mayores = IntArray(2)
    mayores[0] = nums[0]
    for (i in nums) {
        if (i==mayores[0]){
            mayores[1] = i
        } else if (i > mayores[0]) {
            mayores[1] = mayores[0]
            mayores[0] = i
        } else {
            if (mayores[1]<i){
                mayores[1]=i
            }
        }
//        mayores.forEach { a-> println(a) }
//        println("---------------")
    }
    println("El más grande es ${mayores[0]} y el segundo más grande es ${mayores[1]}")

}