package ss6_Inheritance.exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,7);
        MovablePoint movablePoint = new MovablePoint(6,3);
        MovablePoint movablePoint1 = new MovablePoint(3,7,9,1);
        System.out.println(movablePoint1);
        System.out.println(movablePoint);
        System.out.println(movablePoint1.move());

    }
}
