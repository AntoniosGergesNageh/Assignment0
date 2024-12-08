class EquilateralTriangle(name: String) : Triangle(name)  {
    private var a: Double = 0.0

    fun setDimensions(side: Double) {
        this.a = side
        // Since all sides are equal then  all three sides are been set to the same value
        // by calling the supe class method for setting the dimensions
        super.setDimensions(a, a, a)
    }

    override fun printDimensions() {
        println("Equilateral Triangle Dimensions are Side: $a")
    }

}