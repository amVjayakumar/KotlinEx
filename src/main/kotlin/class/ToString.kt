package `class`

data class StringUser(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = StringUser("John", 29)
    println(u1.toString())
}