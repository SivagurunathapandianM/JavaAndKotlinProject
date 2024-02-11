package functions

fun main(){
    val avg= {
        n1: Int, n2: Int, n3: Int -> (n1+n2+n3)/3
    }

    print("The Average value is::"+avg(10,20,30))
}