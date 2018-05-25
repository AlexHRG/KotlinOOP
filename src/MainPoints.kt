fun main(args: Array<String>) {
    val pointC = ColorPoint(1.0, 2.0, ColorPoint.Colors.RED)
    val pointD = ColorPoint(1.0, 2.0, ColorPoint.Colors.BLUE)

    println(pointC)

    val pointA = Point(1.0, 2.0)
    //val pointB = Point(2.0, 2.5)
    println(pointA)

    println(pointC.equals(pointD))
    //pointB.x = 1.0
    //println(pointA.equals(pointB))
    //println(pointA == pointC)
    println("Distance = %.3f".format(pointC.distance(pointD)))
}