package Quan_ly_phuong_tien_giao_thong_MVC.Sevice.ql;

import Quan_ly_phuong_tien_giao_thong_MVC.Model.Truck;
import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.ITruck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckSevice implements ITruck {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Truck> truckList = new ArrayList<>();

    @Override
    public void addTruck() {
        Truck truck = this.infoTruck();
        truckList.add(truck);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllTruck() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void removeTruck() {
        System.out.println("Mời bạn nhập biển số xe cần xóa: ");
        String licensePlates = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlates().equals(licensePlates)) {
                System.out.println("Bạn có chắc muốn xóa xe này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    truckList.remove(i);
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
    public Truck infoTruck() {
        System.out.println("Mời bạn nhập biển kiểm soát");
        String licensePlates = scanner.nextLine();
        System.out.println("Mời bạn nhập tên hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất");
        double year = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập trọng tải");
        String tonnage = scanner.nextLine();
        Truck truck;
        truck = new Truck(licensePlates, manufacturer, year, owner,tonnage);
        return truck;
    }
}
