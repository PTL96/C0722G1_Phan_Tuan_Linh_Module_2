package ss7_Abstractclass_interface.exercise1;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0d;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getArena() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void size(double percent) {
        setRadius(radius + radius * (percent / 100));
    }

    @Override
    public String toString() {
        return "Circle";
    }
}

