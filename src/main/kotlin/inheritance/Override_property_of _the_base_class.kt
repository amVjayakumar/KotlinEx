// Empty primary constructor

open class Persons() {
    open var age: Int = 0
        get() = field

        set(value) {
            field = value
        }
}

class Girls: Persons() {

     override var age: Int = 0
        get() = field

        set(value) {
            field = value - 5
        }
}

fun main(args: Array<String>) {

    val girl = Girls()
    girl.age = 31
    println("My fake age is ${girl.age}.")
}