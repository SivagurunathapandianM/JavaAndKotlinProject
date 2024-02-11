package Collections

class A(val x: Int)
fun main(args: Array<String>) {
    val prop = A::x
    println(prop.get(A(5)))
}