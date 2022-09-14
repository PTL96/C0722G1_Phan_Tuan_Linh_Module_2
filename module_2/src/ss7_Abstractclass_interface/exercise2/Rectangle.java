package ss7_Abstractclass_interface.exercise2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getAre() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width * this.length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangular with width= " + this.width + ", length= " + this.length;
    }
}

