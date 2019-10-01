package session10;

/**
 * The parent class for all shapes.
 */
public class Shape {
    /**
     * The position of the shape. The meaning of this is different depending
     * on the shape.
     */
    private Position pos;

    /**
     * The shape fill color.
     */
    private String fillColor;

    /**
     * The shape line color.
     */
    private String lineColor;

    /**
     * Creates a new shape.
     *
     * @param pos The initial position of the shape.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     */
    public Shape(Position pos, String fillColor, String lineColor) {
        this.pos = pos;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    public Position getPos() {
        return pos;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void move(Position pos) {
        this.pos = pos;
    }

    /**
     * Returns the area of the shape. This cannot be computed for all shapes,
     * and so this method must be overridden in a child class.
     *
     * @return The area of the shape. By default this is 0.
     */
    public double area() {
        return 0.0d;
    }

    /**
     * Returns the perimeter of the shape. This cannot be computed for all
     * shapes, and so this method must be overridden in a child class.
     *
     * @return The perimeter of all shapes.
     */
    public double perimeter() {
        return 0.0d;
    }
}
