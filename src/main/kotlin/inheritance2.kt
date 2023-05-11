open class animals(color:String,age:Int){
    init {
        println("color is :$color.")
        println("age id :$age")
    }
}
class dog(color: String,age: Int):animals(color, age){
    fun barks(){
        println("a dog barks")
    }
}
class cat(color: String,age: Int):animals(color, age){
    fun meows(){
        println("a cat meows")
    }
}
class horse(color: String,age: Int):animals(color, age){
    fun heighs(){
        println("a horse heighs")

    }
}

fun main(args: Array<String>) {
    val d=dog("black", 5)
    d.barks()
    val c=cat("white",3)
    c.meows()
    val h=horse("brown",8)
}