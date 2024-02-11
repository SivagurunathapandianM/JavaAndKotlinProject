package OopsConcepts

fun main(args: Array<String>){
    Account()
    var acc= Account()
    acc.insert(832345,"Ankit",1000f) //accessing member function
    println("${acc.name}") //accessing class property
}