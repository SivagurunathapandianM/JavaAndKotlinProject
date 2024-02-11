package functions

fun main(args: Array<String>){
    val myLambda: (Int) -> Unit=
            {
              s: Int -> println(s)
            } //lambda function
    addNumber(5,10,myLambda)
}
fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
    val add = a + b
    mylambda(add) // println(add)
}