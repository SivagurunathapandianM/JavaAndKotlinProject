package Collections

fun main(){
    val myMap = mapOf<Int,String>(1 to "siva",2 to "guru")
    for(key in myMap.keys){
        println(myMap[key])
    }
}