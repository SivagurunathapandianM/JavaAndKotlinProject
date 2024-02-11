package Collections

fun main(args: Array<String>) {
    fun isPositive(x: Int) = x > 0
    fun isPositive(s: String) = s== "kotlin" || s == "Kotlin"

    val numbers = listOf(-10,-5,0,5,10)
    val strings = listOf("kotlin", "program")

    println(numbers.filter(::isPositive))
    println(strings.filter(::isPositive))
}