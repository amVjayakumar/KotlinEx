package constructor


fun main (args:Array<String>) {

    var peopleObject =  People("Vijay",20)
    print("Name is : ${peopleObject.name}")
    print(" : ${peopleObject.age}")
}

class People (val name:String,var age:Int)