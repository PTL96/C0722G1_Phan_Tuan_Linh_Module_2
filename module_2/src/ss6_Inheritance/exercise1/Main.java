package ss6_Inheritance.exercise1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        circle.setRadius(4);
        circle.setColor("Yelow");
        cylinder.setHeight(10);
        cylinder.setLongs(15);
        cylinder.setWide(4);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.Volume());
    }
}
