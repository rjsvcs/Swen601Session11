package session10;

public class Rectangle extends Shape {
    private double width;
    private double height;


    public Rectangle(Position pos, String fillColor, String lineColor,
                     double wdith, double height) {
        super(pos, fillColor, lineColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return width*2 + height*2;
    }
}
