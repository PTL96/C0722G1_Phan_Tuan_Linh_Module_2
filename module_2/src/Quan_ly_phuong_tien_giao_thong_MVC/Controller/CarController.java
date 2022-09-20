package Quan_ly_phuong_tien_giao_thong_MVC.Controller;

import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.ICar;
import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.impl.CarSevice;

import java.util.Scanner;

public class CarController {
    private static final ICar iCar = new CarSevice();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuCar() {
        while (true) {
            System.out.println("************************ - MENU CAR - *************************");
            System.out.println("Chào mừng bạn đến với chương trình xe dịch vụ của Tuấn Linh");
            System.out.println("1. Thêm mới xe");
            System.out.println("2. Hiển thị danh sách xe");
            System.out.println("3. Xóa xe");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCar.addCar();
                    break;
                case 2:
                    iCar.displayAllCar();
                    break;
                case 3:
                    iCar.removeCar();
                    break;
                case 4:
                    return;
            }
        }
    }
}

