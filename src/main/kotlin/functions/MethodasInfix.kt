package functions

class MethodasInfix {
    infix fun square(number: Int): Int {
        return number * number
    }
}

fun main() {
    val math = MethodasInfix()
    val res = math square 9 //Infix method call
    println("result of infix method $res")
}
