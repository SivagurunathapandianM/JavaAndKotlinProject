package NullSafety

fun main(){
    val name: String? = null
    println(name?.length)
try {

    val company: String? = null
    println(company!!.length)
}
catch (e: Exception){
    val age: String? = null
    println(age?:"invalid age")

}

}