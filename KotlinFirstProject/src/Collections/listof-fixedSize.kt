package Collections

fun main(args: Array<String>){
    var list = listOf(1,2,3,"siva","guru","natha","pandian")
    for(listelement in list){
        println("List of elements::"+listelement)
    }

    for(index in 0..list.size-1){
        println(list[index])
    }
}