fun caro(){
    println("this is a customised user defined function")
}

fun main(args: Array<String>) {
    caro()
    hesabu()
    division()


}
fun hesabu(){
    val num=3
    val  num1=5
    println("the sum of $num and $num1 is ${num+num1}")
}
fun division(){
    val num3=34
    val num4=2
    println("the division of $num3 and $num4 is ${num3/num4}")
}