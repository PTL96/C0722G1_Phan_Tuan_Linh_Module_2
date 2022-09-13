package Draft.draft2;

public class Circle extends Geometric {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArena(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius;
    }
}
