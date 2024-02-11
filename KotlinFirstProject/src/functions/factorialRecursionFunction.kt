package functions

fun main(args: Array<String>) {
    val number = 5
    val result: Long
    result = factorial(number)
    println("Factorial of $number = $result")
}

fun factorial(n: Int): Long {
    return if(n == 1){
        n.toLong()
    }
    else{
        n*factorial(n-1)
    }
}