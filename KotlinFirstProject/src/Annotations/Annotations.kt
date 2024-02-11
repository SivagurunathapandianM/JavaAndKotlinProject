package Annotations

@Ann(value = 10)
class MyClass{

}
fun main (args: Array<String>){
    var c = MyClass()
    var x = c.javaClass.getAnnotation(Ann::class.java)
    if(x!=null){
        println("Value:"+x?.value)
    }
}
