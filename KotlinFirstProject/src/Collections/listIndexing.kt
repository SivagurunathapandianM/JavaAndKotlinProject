package Collections


    fun main(args: Array<String>){
        var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash","Vijay","Rohan")
        var list: List<String> = listOf<String>("Ajay","Vijay","siva")
        for(element in stringList){
            print(element+" ")
        }
        println()
        println("******************************")
        println(stringList.get(0))
        println(stringList.indexOf("Vijay"))
        println(stringList.lastIndexOf("Vijay"))
        println(stringList.size)
        println("******************************")
        println(stringList.contains("Prakash"))
        println(stringList.containsAll(list))
        println(stringList.subList(2,4))
        println(stringList.isEmpty())
        println(stringList.drop(1))
        println(stringList.dropLast(2))
    }
