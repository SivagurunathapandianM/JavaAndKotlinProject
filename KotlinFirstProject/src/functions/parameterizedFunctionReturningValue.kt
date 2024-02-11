package functions

fun main(){
    val a = 23
    val b = 32
    val c = 45

    val result = calculated(a,b,c)
    println("Calculate resulted value $result")
}

fun calculated(a: Int, b: Int, c: Int): Int {
  return (a+b+c)/2
}
