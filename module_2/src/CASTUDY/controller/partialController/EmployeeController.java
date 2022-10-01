package CASTUDY.controller.partialController;

import CASTUDY.sevice.IEmployeeSevice;
import CASTUDY.sevice.impl.EmployeeSevice;

import java.util.Scanner;

public class EmployeeController {
    private static final IEmployeeSevice iEmployee = new EmployeeSevice();
    public static void menuEmployee() {
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("1. Hiển thị danh sách Employee");
                System.out.println("2. Thêm mới Employee");
                System.out.println("3. Sửa Employee");
                System.out.println("4. Exit");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return;
                    default:
                        System.out.println("Vui lòng chọn từ 1 đến 4");
                }
            }
        }
    }

