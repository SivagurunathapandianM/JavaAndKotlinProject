package Collections

fun main(args: Array<String>){

    val myMap: Map<Int,String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")

    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
    println(".......myMap.asIterable().....")
    for(itr in myMap.asIterable()){
        println("key = ${itr.key} value = ${itr.value}")
    }
}