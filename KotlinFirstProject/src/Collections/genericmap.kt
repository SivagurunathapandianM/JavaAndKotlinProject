package Collections

fun main(args: Array<String>){

    val myMap = mapOf(1 to "Ajay", 4 to "Vijay", 3 to "Prakash","ram" to "Ram", "two" to 2)
    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
}