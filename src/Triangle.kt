open class Triangle(_name: String) : Shape(_name) {
    private var a :Double= 0.0
    private var b :Double= 0.0
    private var c :Double= 0.0

    fun setDimensions(_a: Double, _b: Double, _c: Double) {
        this.a = _a
        this.b = _b
        this.c = _c
    }

    override fun getArea(): Double {
        val s = (a + b + c) / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }
    override fun printDimensions() {
        println("Triangle Dimensions are Sides: $a, $b, $c")
    }

}