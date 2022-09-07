package ss1_java.exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gửi lời chào đến ?");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
