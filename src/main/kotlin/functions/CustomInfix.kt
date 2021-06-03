package functions

infix fun Int.greaterNumber(secondValue: Int): Int =if(this>secondValue) this else secondValue
infix fun Int.lesserNumber(secondValue: Int):Int =if(this<secondValue)this else secondValue

fun main(args: Array<String>) {
    val a = 20
    val b = 10
   val normalResult = a.greaterNumber(b)
    val infixResult = a greaterNumber b
    val normalResultLess =a.lesserNumber(b)
    val infixResultLess = a lesserNumber b
    //println("Normal result is $normalResult")
   // println("Infix result is $infixResult")
    println("Normal result is $normalResultLess")
    println("Infix result is $infixResultLess")

}