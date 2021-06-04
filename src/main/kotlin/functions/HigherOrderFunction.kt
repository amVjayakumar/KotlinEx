package functions

  // Higher order function means High level function
 // accepts function as a parameter or retruns of function or both
// we can pass function as parameter in other function


fun main (){

   // highOrder(5.5,3.5, :: add)

    //if u need to store highorder function to variable

    var MyVar = highOrder(5.5,3.5, :: add)
print(MyVar)

}

fun add(a:Double, b:Double):Double{
    return a+b
}

fun highOrder( a:Double,b:Double ,fn:(Double,Double)-> Double){

    println(fn(a,b))




}