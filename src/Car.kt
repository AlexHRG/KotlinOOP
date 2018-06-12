class Car (val x: Double, val y : Double, val fuelCapacity : Double, var fuelAmount : Double, val fuelConsumption : Double, val model : String) {
    private var coordinates = Point(x, y)

    override  fun toString() : String {
        return "${model} on ${coordinates.toString()}, fuel amount: %.3f".format(fuelAmount)
    }

    fun moveTo(x: Double, y: Double) {
        val newPoint = Point(x, y)

        if (newPoint.equals(coordinates)) throw Exception("Already there")

        val fuelNeeded = newPoint.distance(coordinates) * fuelConsumption

        if (fuelNeeded > fuelCapacity) throw Exception("Not enough fuel")

        coordinates = newPoint
        fuelAmount -= fuelNeeded
    }

    fun refillFuel(amount : Double) {
        if (amount <= 0.0) throw Exception("Wrong amount!")

        fuelAmount += amount
        if (fuelAmount > fuelCapacity) fuelAmount = fuelCapacity
    }
}

fun main(args: Array<String>) {
    val bmw = Car(1.0, 2.0, 55.0, 50.0, .85,"\'BMW 3\'")


    try {
        println(bmw.toString())
        bmw.moveTo(2.0, 5.0)
        bmw.refillFuel(1.0)
        println(bmw.toString())
    } catch (e : Exception) {
        println(e.message)
    }



}