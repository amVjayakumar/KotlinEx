
class Lamp {

    // property (data member)
    private var isOn: Boolean = true

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus() {
        if (isOn == true)
            println("lamp is on.")
        else
            println("lamp is off.")
    }
}

fun main(args: Array<String>) {

    val lamp = Lamp()
    lamp.displayLightStatus()
}