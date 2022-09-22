package Quan_Ly_Hoc_Sinh_MVC.sevice.ipml;

import Quan_Ly_Hoc_Sinh_MVC.Model.Teacher;
import Quan_Ly_Hoc_Sinh_MVC.sevice.ITeacherSevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherSevice implements ITeacherSevice {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Mời bạn nhập mã giáo viên cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa giáo viên này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
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
    @Override
    public void searchNameTeacher() {
        int count = 0;
        System.out.println("Vui lòng nhập ký tự có trong tên hoặc tên Giáo Viên muốn tìm");
        String name = scanner.nextLine();
        for (Teacher teacher : teacherList) {
            if (teacher.getName().contains(name)) {
                System.out.println(teacher);
                count++;
            }
        }
        if (count < 0) {
            System.out.println("Không có sản phẩm cần tìm kiếm trong Menu" + name);
        }
    }

    @Override
    public void searchIdTeacher() {
        int count = 0;
        System.out.println("Vui lòng nhập ID Giáo Viên muốn tìm");
        String id = scanner.nextLine();
        for (Teacher teacher : teacherList) {
            if (teacher.getCode().equals(id)) {
                System.out.println(teacher);
                count++;
            }
        }
        if (count < 0) {
            System.out.println("Không có sản phẩm cần tìm kiếm trong Menu" + id);
        }

    }

    public Teacher infoTeacher() {
        System.out.println("Mời bạn nhập mã giáo viên");
        String code = scanner.nextLine();
        System.out.println("Mời bạn nhập tên giáo viên");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập giới giáo viên");
        String temGender = scanner.nextLine();
        Boolean gender;
        if (temGender.equals(("Nam"))) {
            gender = true;
        } else if (temGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Mời bạn nhập chuyên môn");
        String nameSpecialize = scanner.nextLine();
        Teacher teacher;
        teacher = new Teacher(code,name,gender,nameSpecialize);
        return teacher;
    }

}
