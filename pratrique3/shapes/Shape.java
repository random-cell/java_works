package shapes;


public class Shape {
    protected String color;
    protected boolean filled;

    // Constructors
    public Shape() {
        this(" none", false);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Color
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // Filled
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public double getArea() {
        System.out.println("Not implemented");
        return 0;
    }
    public double getPerimeter() {
        System.out.println("Not implemented");
        return 0;
    }
    public String toString() {
        System.out.println("Not implemented");
        return "";
    }

}
