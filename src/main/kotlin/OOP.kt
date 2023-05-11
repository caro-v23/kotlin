class  Sturborn{
    //datamember
    private var nambari:Int=5
    private var num2:Int=34
    private var num3:Int=7


 //member function
    fun calculate():Int{
     return nambari *nambari



  }
    fun division():Int{
     return num2 /num3

    }
}
fun main(arg: Array<String>) {
    //this is an object
    val myobject=Sturborn()
    println(myobject.calculate())
    val berries=Fruits()
    println(myobject.calculate())
    val number=division()
    println(myobject.division())

  }

class Fruits{
    var berries:Int=3
}


