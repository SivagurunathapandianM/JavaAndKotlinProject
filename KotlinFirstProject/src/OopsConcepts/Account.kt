package OopsConcepts

class Account {
    var acc_no: Int = 0
    var name: String =  ""
    var amount: Float = 0.toFloat()
    fun insert(ac: Int,n: String, am: Float ) {
        acc_no=ac
        name=n
        amount=am
        println("Account no: ${acc_no} holder :${name} amount :${amount}")
    }

    fun deposit() {
        //deposite code
    }

    fun withdraw() {
        // withdraw code
    }

    fun checkBalance() {
        //balance check code
    }

}