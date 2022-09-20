package Quan_ly_phuong_tien_giao_thong_MVC.Controller;

import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.ITruck;
import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.impl.TruckSevice;

import java.util.Scanner;

public class TruckController {
    private static final ITruck iTruck = new TruckSevice();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuTruck() {
        while (true) {
            System.out.println("************************ - MENU CAR - *************************");
            System.out.println("Chào mừng bạn đến với chương trình xe tải của Tuấn Linh");
            System.out.println("1. Thêm mới xe");
            System.out.println("2. Hiển thị danh sách xe");
            System.out.println("3. Xóa xe");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTruck.addTruck();
                    break;
                case 2:
                    iTruck.displayAllTruck();
                    break;
                case 3:
                    iTruck.removeTruck();
                    break;
                case 4:
                    return;
            }
        }
    }
}
