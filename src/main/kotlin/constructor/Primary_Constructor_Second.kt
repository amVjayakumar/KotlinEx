package constructor



fun main(args : Array<String>){


funConstructor("Vijayakumar",31)
}


class funConstructor(val fname:String , var eage:Int){


    /* val name:String
     var age:Int

     init {
         name=fname.capitalize()
         age =eage

         println("Name :$name")
         println("Age :$age")

     }*/



    val name =fname.capitalize()
    var age =eage

    init {

        println("name : $name")
        println("age : $age")
    }

}