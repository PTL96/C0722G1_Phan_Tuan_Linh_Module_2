package CASTUDY.controller.mangaController;

import CASTUDY.controller.partialController.CustomerController;
import CASTUDY.controller.partialController.EmployeeController;
import CASTUDY.controller.partialController.FacilityController;
import CASTUDY.model.resort.House;
import CASTUDY.model.resort.Room;
import CASTUDY.model.resort.Villa;

import java.util.Scanner;


public class TotalMenu {
//    private static final CustomerController custom = new CustomerController();
//    private static final EmployeeController employ = new EmployeeController();
    private static final House house = new House();
    private static final Room room = new Room();
    private static final Villa villa = new Villa();
//    private static final FacilityController facility = new FacilityController();
    private static final Scanner scanner = new Scanner(System.in);
    public static void totalMenu(){
        while (true){
            System.out.println("********** - CHÀO MỪNG ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ RESORT FURUMA - **********");
            System.out.println("1. Quản lý Facility");
            System.out.println("2. Quản lý Employee");
            System.out.println("3. Quản lý Customer");
            System.out.println("4. Exit");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){

                case 1:
                   FacilityController.menuFacility();
                    break;
                case 2:
                    EmployeeController.menuEmployee();
                    break;
                case 3:
                    CustomerController.menuCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 4");

            }
        }
    }
}