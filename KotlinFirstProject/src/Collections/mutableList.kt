package Collections

fun main(args: Array<String>){
    var listMutable = mutableListOf(1,2,3,"siva","guru","natha","pandian")
    for (Mutableelements in listMutable){
        println(Mutableelements)
    }

    println()
    for(index in 0..listMutable.size-1){
        println(listMutable[index])
    }
}