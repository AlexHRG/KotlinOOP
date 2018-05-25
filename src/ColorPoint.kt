class ColorPoint : Point {

    private var color: Colors

    constructor(x: Double, y: Double, color: Colors) : super(x, y) {
        this.color = color
    }

    enum class Colors {RED, GREEN, BLUE, YELLOW, WHITE, BLACK, GREY}

    override fun toString(): String {
        return "${super.toString()}, color=${color}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as ColorPoint

        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + color.hashCode()
        return result
    }

}