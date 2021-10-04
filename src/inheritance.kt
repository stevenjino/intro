open class vehicles(model: String, color: String, YoM: Int) {
    init {
        println("The model of the vehicle is: $model")
        println("The color of the vehicle is: $color")
        println("Its Year of Manufacture is: $YoM")
    }
}
class toyota(model: String, color: String, YoM: Int): vehicles(model, color, YoM){
    fun landcruiser(){
        println("Love the V8")
    }
}
class bmw(model: String, color: String, YoM: Int): vehicles(model, color, YoM){
    fun x5(){
        println("Love the X5")
    }
}
class rangerover(model: String, color: String, YoM: Int): vehicles(model, color, YoM){
    fun evoque(){
        println("Love the Evoque")
    }
}
class jeep(model: String, color: String, YoM: Int): vehicles(model, color, YoM){
    fun wrangler(){
        println("Love the Wrangler")
    }
}
class mercedes(model: String, color: String, YoM: Int): vehicles(model, color, YoM){
    fun gclass(){
        println("Love the G-Wagon")
    }
}

fun main(args: Array<String>) {
    val v1 = toyota("TX", "Gold", 2014)
    v1.landcruiser()

    val v2 = bmw("X5", "White", 2014)
    v2.x5()

    val v3 = rangerover("Evoque", "Bloody Red", 2015)
    v3.evoque()

    val v4 = jeep("Wrangler", "Dark Blue", 2014)
    v4.wrangler()

    val v5 = mercedes("G-Wagon", "Silver", 2015)
    v5.gclass()
}

