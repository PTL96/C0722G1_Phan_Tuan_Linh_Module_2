package Quan_ly_phuong_tien_giao_thong_MVC.Sevice.impl;

import Quan_ly_phuong_tien_giao_thong_MVC.Model.Car;
import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.ICar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSevice implements ICar {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Car> carList = new ArrayList<>();

    @Override
    public void addCar() {
        Car car = this.infoCar();
        carList.add(car);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllCar() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void removeCar() {
        System.out.println("Mời bạn nhập biển số xe cần xóa: ");
        String licensePlates = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicensePlates().equals(licensePlates)) {
                System.out.println("Bạn có chắc muốn xóa xe này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    carList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    public Car infoCar() {
        System.out.println("Mời bạn nhập biển kiểm soát");
        String licensePlates = scanner.nextLine();
        System.out.println("Mời bạn nhập tên hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất");
       double year = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập số chỗ ngồi");
        double seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập kiểu xe");
        String vehicleType = scanner.nextLine();
        Car car;
        car = new Car(licensePlates, manufacturer, year, owner,seat,vehicleType);
        return car;
    }

}
