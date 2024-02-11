package Array

fun main(args: Array<String>) {
    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf<Long>(5,6,7,8)
    for(element in array1){
        print(element)
    }
    println()
    for(element in array2){
        print(element)
    }
    array1.set(0,5)
    array1[2] = 6

    array2.set(2,10)
    array2[3] = 8
    println()
    for(element in array1){
        print(element)
    }
    println()
    for(element in array2){
        print(element)
    }
}