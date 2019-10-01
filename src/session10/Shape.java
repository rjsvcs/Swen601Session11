package session10;

public class Shape {
    private Position pos;
    private String fillColor;
    private String lineColor;

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

    public double area() {
        return 0.0d;
    }

    public double perimeter() {
        return 0.0d;
    }
}
