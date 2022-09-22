package Quan_Ly_Hoc_Sinh_MVC.Controller;

import Quan_Ly_Hoc_Sinh_MVC.sevice.ITeacherSevice;
import Quan_Ly_Hoc_Sinh_MVC.sevice.ipml.TeacherSevice;

import java.util.Scanner;

public class TeacherController {
    private static final ITeacherSevice iTeacherSevice = new TeacherSevice();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuTeacher() {
        while (true) {
            System.out.println("************** - CHƯƠNG TRÌNH QUẢN LÝ GIÁO VIÊN - *************");
            System.out.println("1. Thêm mới giáo viên");
            System.out.println("2. Hiển thị danh sách giáo viên");
            System.out.println("3. Tìm kiếm giáo viên theo ID");
            System.out.println("4. Tìm kiếm giáo viên theo tên");
            System.out.println("5. Xóa giáo viên");
            System.out.println("6. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherSevice.addTeacher();
                    break;
                case 2:
                    iTeacherSevice.displayAllTeacher();
                    break;
                case 3:
                    iTeacherSevice.searchIdTeacher();
                    break;
                case 4:
                    iTeacherSevice.searchNameTeacher();
                    break;
                case 5:
                    iTeacherSevice.removeTeacher();
                    break;
                case 6:
                    return;
            }
        }
    }
}
