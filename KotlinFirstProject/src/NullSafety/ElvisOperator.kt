package NullSafety

fun main(args: Array<String>){
    val fruitName: String = fruits()
    println(fruitName)
}

fun fruits(): String {

    val str: String? ="abc"
    val strLength: Int = if(str!= null) str.length else -1
    val strLength2: Int = str?.length ?: -1
    var string = "str = $str\n"+
            "strLength = $strLength\n"+
            "strLength2 = $strLength2\n\n"

    fun check(textOne: String?, textTwo: String?): String?{
        val textOne = textOne ?: return null
        val textTwo = textTwo ?: IllegalArgumentException("text exception")

        return "\ntextOne = $textOne\n"+
                "textTwo = $textTwo\n"
    }
    string += "check(null,\"mango\") = ${check("mango","pomgranate")}\n" +
            "check(\"apple\",\"orange\") = ${check("apple","orange")}\n"
    return string
}
  