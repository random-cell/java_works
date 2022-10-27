package shapes;

public class Circle extends Shape {
    protected double radius;


    // Constructors
    public Circle() { this(0); }
    public Circle(double radius) { this.radius = radius; }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    // Radius
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }


    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public String toString() {
        return "Circle{" + "radius= " + radius + ", color= '" + color + '\'' + ", filled=" + filled + '}';
    }
}
