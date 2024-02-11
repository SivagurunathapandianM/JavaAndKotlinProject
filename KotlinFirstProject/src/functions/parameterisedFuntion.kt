package functions

fun main(){
    val a = 23
    val b = 32
    val c = 45

    calculate(a,b,c)
}

fun calculate(a: Int, b: Int, c: Int) {
   val result = (a+b+c)/2
    println("Calculate resulted value $result")
}
