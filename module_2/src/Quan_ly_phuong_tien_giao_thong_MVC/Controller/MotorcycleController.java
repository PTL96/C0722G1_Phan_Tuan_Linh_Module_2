package Quan_ly_phuong_tien_giao_thong_MVC.Controller;

import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.IMotorcycle;
import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.impl.MotorcycleSevice;

import java.util.Scanner;

public class MotorcycleController {
    private static final IMotorcycle iMotorcycle = new MotorcycleSevice();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuMoto() {
        while (true) {
            System.out.println("************************ - MENU CAR - *************************");
            System.out.println("Chào mừng bạn đến với chương trình xe mô-tô của Tuấn Linh");
            System.out.println("1. Thêm mới xe");
            System.out.println("2. Hiển thị danh sách xe");
            System.out.println("3. Xóa xe");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iMotorcycle.addMoto();
                    break;
                case 2:
                    iMotorcycle.displayAllMoto();
                    break;
                case 3:
                    iMotorcycle.removeMoto();
                    break;
                case 4:
                    return;
            }
        }
    }
}
