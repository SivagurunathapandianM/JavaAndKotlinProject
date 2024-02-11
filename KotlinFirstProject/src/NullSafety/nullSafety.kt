package NullSafety

fun main(args : Array<String>){
   var str : String? = "Hello"
    var len = CalculateLen(str)

    println("Length of the string $len")
    println("String value $str")

    str = null
    len = CalculateLen(str)

    println("Length of the string $len")
    println("String value $str")

}

fun CalculateLen(str: String?): Int {
    if(str != null) {
       return  str.length
    }
    else{
       return -1
    }
}

