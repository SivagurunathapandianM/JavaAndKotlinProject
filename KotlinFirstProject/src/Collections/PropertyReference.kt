package Collections

fun main(args: Array<String>) {
    println(::x.get())
    println(::x.name)
    println(::y.set(10))
}
val x = 5
var y = 5