package functions

fun main(){
    HighOrderFunction(10,20,30,::myHigherFunction)
}

fun HighOrderFunction(num1: Int, num2: Int, num3: Int, funcname: (Int,Int,Int)-> Int) {
   print(funcname(num1,num2,num3))
}

fun myHigherFunction(num1: Int, num2: Int, num3: Int): Int {
   return ((num1+num2+num3)/3)
}
