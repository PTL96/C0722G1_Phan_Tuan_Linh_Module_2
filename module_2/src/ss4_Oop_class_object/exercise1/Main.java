package ss4_Oop_class_object.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số b");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số c");
        double c = Integer.parseInt(scanner.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
quadraticEquation.solveTheEquation();
    }

}
