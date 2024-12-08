fun main() {
    // Create instances of each shape
    val square = Square("My Square")
    val circle = Circle("My Circle")
    val equilateralTriangle = EquilateralTriangle("My Equilateral Triangle")
    val triangle = Triangle("My Triangle")

    // Take  dimensions as input from the user
    println("Enter dimension for the square:")
    print("Side: ")
    val squareSide = readLine()!!.toDouble()
    square.setDimensions(squareSide)

    println("Enter dimensions for the circle:")
    print("Radius: ")
    val circleRadius = readLine()!!.toDouble()
    circle.setDimension(circleRadius)

    println("Enter dimensions for the equilateral triangle:")
    print("Side: ")
    val triangleSide = readLine()!!.toDouble()
    equilateralTriangle.setDimensions(triangleSide)

    println("Enter dimensions for the triangle:")
    print("Side A: ")
    val triangleSideA = readLine()!!.toDouble()
    print("Side B: ")
    val triangleSideB = readLine()!!.toDouble()
    print("Side C: ")
    val triangleSideC = readLine()!!.toDouble()
    triangle.setDimensions(triangleSideA, triangleSideB, triangleSideC)

    // Printing the shape information for each one
    println("\nShape Information:")
    println("----------------")

    // Square Information
    square.printDimensions()
    println("Shape: ${square.name}")
    println("Area: ${square.getArea()}")
    println("----------------")

    // Circle Information
    circle.printDimensions()
    println("Shape: ${circle.name}")
    println("Area: ${circle.getArea()}")
    println("----------------")

    // Equilateral Triangle Information
    equilateralTriangle.printDimensions()
    println("Shape: ${equilateralTriangle.name}")
    println("Area: ${equilateralTriangle.getArea()}")
    println("----------------")

    // Triangle Information
    triangle.printDimensions()
    println("Shape: ${triangle.name}")
    println("Area: ${triangle.getArea()}")
    println("----------------")
}
