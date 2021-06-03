package abstract_interface



interface MyInterface {

    val test: Int   // abstract property

    fun foo() : String   // abstract method (returns String)
    fun hello() {   // method with default implementation
        println("Hello there, pal!") // body (optional)
    }
}

class InterfaceImp : MyInterface {

    override val test: Int = 25
    override fun foo() = "Lol"

    // other code
}

fun main(args: Array<String>) {
    val obj = InterfaceImp()

    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()

    print("Calling and printing foo(): ")
    println(obj.foo())
}