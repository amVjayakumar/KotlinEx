package functions

/*You can make a function call in Kotlin using infix notation if the function

is a member function (or an extension function).
has only one single parameter.
is marked with infix keyword.*/

//Kotlin allows some functions to be called without using the period and brackets.


fun main(){

    var a = true;
    var b = false
    var result : Boolean
    result =  a || b
    print("Result is $result")
}