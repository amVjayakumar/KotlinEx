package `class`

// The primary constructor must have at least one parameter.
// The parameters of the primary constructor must be marked as either val (read-only) or var (read-write).
// The class cannot be open, abstract, inner or sealed.
// The class may extend other classes or implement interfaces. If you are using Kotlin version before 1.1, the class can only implement interfaces.
// When you declare a data class, the compiler automatically generates several functions such as toString(), equals(), hashcode() etc behind the scenes. 

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User("jack", 29)
    println("name = ${jack.name}")
    println("age = ${jack.age}")
}
