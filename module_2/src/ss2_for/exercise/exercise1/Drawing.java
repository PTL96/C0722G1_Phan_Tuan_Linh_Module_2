package ss2_for.exercise.exercise1;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Ấn 1 để in hình Chữ Nhật");
            System.out.println("Ấn 2 để in hình Tam Giác botton-left");
            System.out.println("Ấn 3 để in hình Tam Giác top-left ");
            System.out.println("Ấn 4 để Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 2; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("\n");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có trong Menu");
            }
        }


    }


}
