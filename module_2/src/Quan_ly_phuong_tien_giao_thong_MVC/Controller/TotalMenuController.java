package Quan_ly_phuong_tien_giao_thong_MVC.Controller;

import java.util.Scanner;

public class TotalMenuController {
    private static final CarController carController = new CarController();
    private static final MotorcycleController motorcycleController = new MotorcycleController();
    private static final TruckController truckController = new TruckController();

    private static final Scanner scanner = new Scanner(System.in);

    public static void menuTotal() {
        while (true) {
            System.out.println("************* - CHÀO MỪNG ĐẾN VỚI DANH SÁCH QUẢN LÝ XE CỦA LINH - ************");
            System.out.println("Chào mừng bạn đến với chương trình quản lý xe của Tuấn Linh");
            System.out.println("1. Ấn 1 để quản lý Car");
            System.out.println("2. Ấn 2 để quản lý xe tải");
            System.out.println("3. Ấn 3 để quản lý xe Mô Tô");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CarController.menuCar();
                    break;
                case 2:
                    TruckController.menuTruck();
                    break;
                case 3:
                    MotorcycleController.menuMoto();
                case 4:
                    return;
            }
        }
    }
}
