package shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    // Constructors
    public Rectangle() { this(1, 2); }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getArea() {
        return getWidth()*getLength();
    }

    public double getPerimeter() {
        return (getWidth() * getLength()) * 2;
    }

    
    public String toString() {
        return "Rectangle{" + "width= " + width + ", length= " + length + ", color= '" + color + '\'' + ", filled= " + filled + '}';
    }
}
