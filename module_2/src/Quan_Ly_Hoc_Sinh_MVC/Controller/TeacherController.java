package Quan_Ly_Hoc_Sinh_MVC.Controller;

import Quan_Ly_Hoc_Sinh_MVC.sevice.ITeacherSevice;
import Quan_Ly_Hoc_Sinh_MVC.sevice.ipml.TeacherSevice;

import java.util.Scanner;

public class TeacherController {
    private static final ITeacherSevice iTeacherSevice = new TeacherSevice();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuTeacher() {
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý CodeGym");
            System.out.println("1. Thêm mới giáo viên");
            System.out.println("2. Hiển thị danh sách giáo viên");
            System.out.println("3. Xóa giáo viên");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherSevice.addTeacher();
                    break;
                case 2:
                    iTeacherSevice.displayAllTeacher();
                    break;
                case 3:
                    iTeacherSevice.removeTeacher();
                    break;
                case 4:
//                    System.exit(0);
                    return;
            }
        }
    }
}
