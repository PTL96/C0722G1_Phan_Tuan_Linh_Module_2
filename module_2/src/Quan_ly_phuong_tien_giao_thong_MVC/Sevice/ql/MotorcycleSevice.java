package Quan_ly_phuong_tien_giao_thong_MVC.Sevice.ql;

import Quan_ly_phuong_tien_giao_thong_MVC.Model.Motorcycle;
import Quan_ly_phuong_tien_giao_thong_MVC.Sevice.IMotorcycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorcycleSevice implements IMotorcycle {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Motorcycle> motorcyclesList = new ArrayList<>();
    @Override
    public void addMoto() {
        Motorcycle motorcycle = this.infoMoto();
        motorcyclesList.add(motorcycle);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllMoto() {
        for (Motorcycle motorcycle : motorcyclesList) {
            System.out.println(motorcycle);
        }
    }

    @Override
    public void removeMoto() {
        System.out.println("Mời bạn nhập biển số xe cần xóa: ");
        String licensePlates = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < motorcyclesList.size(); i++) {
            if (motorcyclesList.get(i).getLicensePlates().equals(licensePlates)) {
                System.out.println("Bạn có chắc muốn xóa xe này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    motorcyclesList.remove(i);
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
    public Motorcycle infoMoto() {
        System.out.println("Mời bạn nhập biển kiểm soát");
        String licensePlates = scanner.nextLine();
        System.out.println("Mời bạn nhập tên hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất");
        double year = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập công suất");
        String wattage = scanner.nextLine();
        Motorcycle motorcycle;
        motorcycle = new Motorcycle(licensePlates, manufacturer, year, owner,wattage);
        return motorcycle;
    }
}
