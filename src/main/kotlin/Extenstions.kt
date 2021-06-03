


//The class name is the receiver type (String class in our example).
// The this keyword inside the extension function refers the receiver object.

fun String.removeFirstLastChar(): String =  this.substring(4, this.length - 4)

fun main(args: Array<String>) {
    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}