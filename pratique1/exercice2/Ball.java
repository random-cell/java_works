package exercice2;

public class Ball {
    private  int radius;
    private String color;

    public Ball(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Ball(int radius) {
        this.radius = radius;
        this.color = "black";
    }

    public Ball(String color) {
        this.radius = 1;
        this.color = color;
    }

    public Ball() {
        this.radius = 1;
        this.color = "black";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Ball{" + "radius=" + radius + ", color='" + color + '\'' + '}';
    }

    public int getDiametr(){
        return 2*radius;
    }
}
