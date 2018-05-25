import java.lang.Math.pow
import kotlin.math.sqrt

open class Point(var x : Double = 0.0, var y : Double = 0.0) {

    override fun toString(): String = "${this.javaClass.simpleName} x=${x}, y=${y}"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Point

        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }


    fun distance(other: Point): Double {
        return sqrt(x = pow((other.x - x), 2.0) + pow((other.y - y), 2.0))
    }
}