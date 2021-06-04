package functions

//An inline function declare Inline Keyword
//inline function tells compiler to copy parqameter and functions to the call  site


fun main(){

    inlineFunction{ println("calling inline function")}
}

inline fun inlineFunction(fn : ()->Unit){
fn()
println("calling inline function")

}