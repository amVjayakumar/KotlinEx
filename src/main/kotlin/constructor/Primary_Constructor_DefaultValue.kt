package constructor

fun main (args:Array<String>){

    println("First person entry")
    val person1 = Person("Vijay",32)
    println("First person entry")
    val person2 = Person("Jack")
    println("First person entry")
    val person3 = Person()
}

class Person(_fName:String="UNKNOWN" , _age:Int=0){

val name=_fName.capitalize()
var age = _age

init {

    println("Name : $name")
    println("Age : $age")
}

}