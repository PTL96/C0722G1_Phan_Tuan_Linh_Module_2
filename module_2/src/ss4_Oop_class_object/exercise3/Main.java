package ss4_Oop_class_object.exercise3;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yelow");
        fan1.setOn(true);
        if (fan1.isOn()){
            System.out.println(fan1+"fan is on");
        }else {
            System.out.println("fan is off");
        }

        }

    }

