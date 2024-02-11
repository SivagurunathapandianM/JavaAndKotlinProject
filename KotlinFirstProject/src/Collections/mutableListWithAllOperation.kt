package Collections

fun main(args: Array<String>){
    var mutableList = mutableListOf<String>()

    mutableList.add("Ajay") // index 0
    mutableList.add("Vijay") // index 1
    mutableList.add("Prakash") // index 2

    var mutableList2 = mutableListOf<String>("Rohan","Raj")
    var mutableList3 = mutableListOf<String>("Dharmesh","Umesh")
    var mutableList4 = mutableListOf<String>("Ajay","Dharmesh","Ashu")


    println(".....mutableList.....")
    for(element in mutableList){
        println(element)
    }
    println(".....mutableList[2].....")
    println(mutableList[2])
    mutableList.add(2,"Rohan")
    println("......mutableList.add(2,\"Rohan\")......")
    for(element in mutableList){
        println(element)
    }
    mutableList.add("Ashu")
    println(".....mutableList.add(\"Ashu\")......")
    for(element in mutableList){
        println(element)
    }


    mutableList.addAll(1,mutableList3)
    println("... mutableList.addAll(1,mutableList3)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(mutableList2)
    println("...mutableList.addAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.remove("Vijay")
    println("...mutableList.remove(\"Vijay\")....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAt(2)
    println("....mutableList.removeAt(2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAll(mutableList2)
    println("....  mutableList.removeAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }

    println("....mutableList.set(2,\"Ashok\")....")
    mutableList.set(2,"Ashok")
    for(element in mutableList){
        println(element)
    }

    println(".... mutableList.retainAll(mutableList4)....")
    mutableList.retainAll(mutableList4)
    for(element in mutableList){
        println(element)
    }
    println(".... mutableList2.clear()....")
    mutableList2.clear()

    for(element in mutableList2){
        println(element)
    }
    println(".... mutableList2 after mutableList2.clear()....")
    println(mutableList2)

    println("********")
    println(mutableList)
    println("....mutableList.subList(1,2)....")
    println(mutableList.subList(1,3))

}