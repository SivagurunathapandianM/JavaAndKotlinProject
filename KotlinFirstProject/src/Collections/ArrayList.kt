package Collections

fun main(args: Array<String>) {

    val arrayList = ArrayList<String>()//Creating an empty arraylist
    arrayList.add("Ajay")//Adding object in arraylist
    arrayList.add("Vijay")
    arrayList.add("Prakash")
    arrayList.add("Rohan")
    arrayList.add("Vijay")
    println(".......print ArrayList.......")
    for (i in arrayList) {
        println(i)
    }
}