package `class`

//The nested classes in Kotlin do not have access to the outer class instance

class Outer {

    val a = "Outside Nested class." //declare Variable

    inner class Inner {  //create Inner class
        fun callMe() = a
    }
}

fun main(args: Array<String>) {

    val outer = Outer() //Outer Object created
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outer().Inner()
    println("Using inner object: ${inner.callMe()}")
}


