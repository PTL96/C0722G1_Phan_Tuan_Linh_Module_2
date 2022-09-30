package Quan_Ly_Hoc_Sinh_MVC.Controller;

import Quan_Ly_Hoc_Sinh_MVC.sevice.IStudentSevice;
import Quan_Ly_Hoc_Sinh_MVC.sevice.ipml.StudenSevice;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
    private static final IStudentSevice iStudentService = new StudenSevice();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuStudent() throws IOException {
        while (true) {
            System.out.println("*************** - CHƯƠNG TRÌNH QUẢN LÝ HỌC VIÊN - *************");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm kiếm học sinh theo ID");
            System.out.println("5. Tìm kiếm học sinh theo Name");
            System.out.println("6. Sắp xếp học sinh");
            System.out.println("7. Thoát");
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
                    iStudentService.searchIdStudent();
                    break;
                case 5:
                    iStudentService.searchNameStudent();
                    break;
                case 6:
                    iStudentService.sortNameStudent();
                    break;
                case 7:
                    return;
            }
        }
    }
}
