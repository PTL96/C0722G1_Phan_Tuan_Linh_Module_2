package CASTUDY.controller.partialController;

import CASTUDY.sevice.ICustomerSevice;
import CASTUDY.sevice.impl.CustomerSevice;

import java.util.Scanner;

public class CustomerController {
    private static final ICustomerSevice customer = new CustomerSevice();
    public static void menuCustomer() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Hiển thị danh sách Customers");
            System.out.println("2. Thêm mới Customer");
            System.out.println("3. Sửa Customer");
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
