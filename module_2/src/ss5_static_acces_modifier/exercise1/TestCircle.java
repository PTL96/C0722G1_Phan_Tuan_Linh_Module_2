package ss5_static_acces_modifier.exercise1;

public class TestCircle {
    private double radius = 1.0d;
    private String color = "red";
    public TestCircle(double radio) {
        this.radius = radio;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public TestCircle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArena() {
        return Math.pow(this.radius,2)*Math.PI;
    }
}
