package Quan_Ly_Hoc_Sinh_MVC.Controller;

import Quan_Ly_Hoc_Sinh_MVC.sevice.IStudentSevice;
import Quan_Ly_Hoc_Sinh_MVC.sevice.ipml.StudenSevice;

import java.util.Scanner;

public class StudentController {
    private static final IStudentSevice iStudentService = new StudenSevice();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý CodeGym");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayAllStudent();
                    break;
                case 3:
                    iStudentService.removeStudent();
                    break;
                case 4:
//                    System.exit(0);
                    return;
            }
        }
    }
}
