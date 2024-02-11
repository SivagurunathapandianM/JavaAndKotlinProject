package functions

fun main(){
    LambdaHighOrderFunction(10,20,30,{
        num1: Int, num2: Int, num3: Int
     -> (num1+num2+num3)/3
    })
}

fun LambdaHighOrderFunction(num1: Int, num2: Int, num3: Int, funcname: (Int,Int,Int)-> Int) {
    print(funcname(num1,num2,num3))
}

