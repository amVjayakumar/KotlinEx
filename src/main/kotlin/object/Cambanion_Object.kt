package `object`

class CambPerson {

    // name of the companion object is omitted
    companion object {
        fun callMe() = println("I'm called.")
    }
}

fun main(args: Array<String>) {
    CambPerson.callMe()
}