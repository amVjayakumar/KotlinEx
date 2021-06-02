package inheritance


open class ParentClass{
   open fun DerivedMethod(){
       println("I am from ParentClass")
   }

}

class Child : ParentClass(){

     override fun DerivedMethod(){
        println("I am from ChildClass")
    }


}
fun main(args:Array<String>){


    var child =Child()
    child.DerivedMethod()

}