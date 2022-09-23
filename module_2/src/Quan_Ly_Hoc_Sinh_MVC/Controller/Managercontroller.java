package Quan_Ly_Hoc_Sinh_MVC.Controller;

import java.util.Scanner;

public class Managercontroller {
    private static final StudentController studentController = new StudentController();
    private static final TeacherController teacherController = new TeacherController();

    private static final Scanner scanner = new Scanner(System.in);

    public static void menuManager() {
        while (true) {
            System.out.println("*********** - MENU QUẢN LÝ - ************");
            System.out.println("Chào mừng bạn đến với chương trình quản lý CodeGym");
            System.out.println("1. Giáo viên");
            System.out.println("2. Học sinh");
            System.out.println("3. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    TeacherController.menuTeacher();
                    break;
                case 2:
                    StudentController.menuStudent();
                    break;
                case 3:
                    return;
            }
        }
    }
}
