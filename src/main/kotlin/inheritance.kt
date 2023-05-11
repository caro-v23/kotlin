open class wazazi{
    val mama="she loves singing"
    val baba="he is so funny"
}
class boy:wazazi(){
    fun mvulana(){
        println(baba)
    }
}

class girl:wazazi(){
    fun msichana(){
        println(mama)


    }
}

fun main(args: Array<String>) {
    val obj=boy()
    obj.mvulana()
    val mm=girl()
    mm.msichana()
}