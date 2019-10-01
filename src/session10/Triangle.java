package session10;

public class Triangle extends Shape {
    /**
     * Used to compute the area of an equilateral triangle.
     */
    private static final double CONSTANT = Math.sqrt(3) / 4.0d;

    private double side;

    public Triangle(Position pos, String fillColor, String lineColor,
                    double side) {
        super(pos, fillColor, lineColor);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return CONSTANT * side * side;
    }

    @Override
    public double perimeter() {
        return side * 3;
    }
}
