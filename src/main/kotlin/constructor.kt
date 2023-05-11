class students(val name:String,var gender:String,val age:Int){


}

fun main(args: Array<String>) {
    //this is an object
    val myobj=students("caro","female",45)

    println("student name is ${myobj.name} and she is ${myobj.gender}of ${myobj.age}")
}