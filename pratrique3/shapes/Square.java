package shapes;

public class Square extends Rectangle {

    public Square() {
        this(1);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public double getSide() { return super.length; }
    public void setSide(double value) { this.setLength(value); }

 
    public void setLength(double value) {
        super.setLength(value);
        super.setWidth(value);
    }

    public void setWidth(double value) {
        super.setLength(value);
        super.setWidth(value);
    }
}
