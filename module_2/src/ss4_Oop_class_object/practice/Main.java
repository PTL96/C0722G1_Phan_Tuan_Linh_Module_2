package ss4_Oop_class_object.practice;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(false);
        fan1.setSpeed(3);
        fan1.setColor("yelow");
        fan1.setRadius(10);
        if (fan1.isOn()) {
            System.out.println("fan is on");
        } else {
            System.out.println("fan is off");
        }
        fan2.setSpeed(3);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2);
    }
}
