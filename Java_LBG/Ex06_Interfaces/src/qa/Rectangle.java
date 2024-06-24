package qa;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle() {}

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String name, String color, double x, double y, double height, double width) {
        super(name, color, x, y);
        this.height = height;
        this.width = width;
    }

    public boolean isSquare() {
        return (width == height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCentrePoint() {
        double centreX = getX() + width/2;
        double centreY = getX() + height/2;
        return new Point (centreX, centreY);
    }

    @Override
    public String toString() {
        return "Rectangle: " + "height: " + height + ", width=" + width + " " + super.toString();
    }
}
