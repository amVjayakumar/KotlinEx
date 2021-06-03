package abstract_interface

//an abstract class Person is created. You cannot create objects of the class.
//the class has a non-abstract property age and a non-abstract method displaySSN(). If you need to override these members in the subclass, they should be marked with open keyword.
//The class has an abstract method displayJob(). It doesn't have any implementation and must be overridden in its subclasses




abstract class Person(name: String) {

    init {
        println("My name is $name.")
    }

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): Person(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val jack = Teacher("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    jack.displaySSN(23123)
}