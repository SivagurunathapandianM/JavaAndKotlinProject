package Collections

fun main(args: Array<String>) {
    fun isPositive(x: Int) = x > 0
    val numbers = listOf(-10, -5, 0, 5, 10)
    println(numbers.filter(::isPositive))
}