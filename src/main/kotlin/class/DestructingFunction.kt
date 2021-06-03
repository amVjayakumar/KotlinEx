package `class`

// the compiler generates componentN() functions all properties for a data class.


data class DestructureUser(val name: String, val age: Int, val gender: String)

fun main(args: Array<String>) {
    val u1 = DestructureUser("John", 29, "Male")

    println(u1.component1())     // John
    println(u1.component2())     // 29
    println(u1.component3())     // "Male"
}