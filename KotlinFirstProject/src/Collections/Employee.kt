package Collections

fun main(args: Array<String>){
    val arrayList: ArrayList<Employee> = arrayListOf<Employee>()
    val e1 = Employee(101, "Ajay", 55555, "Delhi")
    val e2 = Employee(102, "Rahul", 44443, "Mumbai")
    val e3 = Employee(103, "Sanjay", 45422, "Noida")
    arrayList.add(e1)
    arrayList.add(e2)
    arrayList.add(e3)

    for (e in arrayList) {
        println("${e.id} ${e.name} ${e.phone} ${e.city}")
    }
}
class Employee(var id: Int, var name: String, var phone: Int, var city: String)