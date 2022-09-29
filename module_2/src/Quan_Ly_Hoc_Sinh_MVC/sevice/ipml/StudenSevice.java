package Quan_Ly_Hoc_Sinh_MVC.sevice.ipml;

import Quan_Ly_Hoc_Sinh_MVC.Model.Student;
import Quan_Ly_Hoc_Sinh_MVC.Utils.ReadFile;
import Quan_Ly_Hoc_Sinh_MVC.Utils.WriteFile;
import Quan_Ly_Hoc_Sinh_MVC.sevice.IStudentSevice;
import Quan_Ly_Hoc_Sinh_MVC.sevice.exception.NameException;
import Quan_Ly_Hoc_Sinh_MVC.sevice.exception.ScoresException;
import Quan_Ly_Hoc_Sinh_MVC.sevice.exception.check;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudenSevice implements IStudentSevice {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();


    @Override
    public void addStudent() throws IOException {
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
        writeStudentFile("module_2/src/Quan_Ly_Hoc_Sinh_MVC/Data/Student.csv",studentList);
    }

    @Override
    public void displayAllStudent() throws IOException {
    studentList = readStudentFile("module_2/src/Quan_Ly_Hoc_Sinh_MVC/Data/Student.csv");

        for (Student student: studentList
             ) {
            System.out.println(student);
        }

    }

    @Override
    public void removeStudent() throws IOException {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        writeStudentFile("module_2/src/Quan_Ly_Hoc_Sinh_MVC/Data/Student.csv",studentList);
    }

    @Override
    public void searchNameStudent() {
        int count = 0;
        System.out.println("Vui lòng nhập ký tự có trong tên hoặc tên học sinh muốn tìm");
        String name = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                System.out.println(student);
                count++;
            }
        }
        if (count < 0) {
            System.out.println("Không có sản phẩm cần tìm kiếm trong Menu" + name);
        }
    }

    @Override
    public void searchIdStudent() {
        int count = 0;
        System.out.println("Vui lòng nhập ID học sinh muốn tìm");
        String id = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getCode().equals(id)) {
                System.out.println(student);
                count++;
            }
        }
        if (count < 0) {
            System.out.println("Không có sản phẩm cần tìm kiếm trong Menu" + id);
        }

    }

    @Override
    public void sortNameStudent() throws IOException {
        boolean isSwap = true;
        Student student;
        for (int i = 0; i < studentList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                int compareName = studentList.get(j).getName().compareTo(studentList.get(j + 1).getName());
                if (compareName > 0) {
                    isSwap = true;
                    student = studentList.get(j + 1);
                    studentList.set(j + 1, studentList.get(j));
                    studentList.set(j, student);
                }
                if (compareName == 0) {
                    int compareId = studentList.get(j).getCode().compareTo(studentList.get(j + 1).getCode());
                    if (compareId > 0) {
                        isSwap = true;
                        student = studentList.get(j + 1);
                        studentList.set(j + 1, studentList.get(j));
                        studentList.set(j, student);
                    }
                }
            }
        }
        displayAllStudent();
        writeStudentFile("module_2/src/Quan_Ly_Hoc_Sinh_MVC/Data/Student.csv",studentList);
    }

    @Override

    public void fakeDisplayStudent() {
        System.out.println("Cập nhật danh sách giả lập thành công, vui lòng ấn 2 để hiển thị danh sách");
        studentList.add(new Student("CG123", "Bảo", "Nam", "C07", 6));
        studentList.add(new Student("CG223", "Linh", "Nam", "C07", 7));
        studentList.add(new Student("CG323", "Tân", "Nam", "C07", 8));
        studentList.add(new Student("CG423", "Phương", "Nữ", "C07", 6));
        studentList.add(new Student("CG523", "Sang", "Nam", "C07", 8));
        studentList.add(new Student("CG623", "Đạt", "Nữ", "C07", 8));
        studentList.add(new Student("CG723", "Khánh", "Nam", "C07", 7));
    }

    public Student infoStudent() {
        String code;
        while (true) {
            System.out.print("Mời bạn nhập mã học sinh: ");
            code = scanner.nextLine();
            boolean check = false;
            for (Student student : studentList) {
                if (student.getCode().equals(code)) {
                    check = true;
                    System.out.println("Mã học sinh đã tồn tại");
                }
            }
            if(!check) {
                break;
            }
        }

        String name = "";
        while (true){
            try {
                System.out.print("Mời bạn nhập tên học sinh: ");
                name = scanner.nextLine();
                for (int i = 0; i <name.length() ; i++) {
                    if(Character.isDigit(name.charAt(i))) {
                        throw new NameException("Tên không được chứa số");
                    }
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());

            }
        }

        String gender;
        while (true) {
            System.out.println("Nhập giới tính");
            try {
                gender = scanner.nextLine();
                if(!(gender.equals("Nam") || gender.equals("Nữ"))) {
                    throw new check("Giới tính không hợp lệ");
                }
                break;
            } catch (check e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        double score;
        while (true){
            System.out.print("Mời bạn nhập điểm của học sinh: ");
            try {
                 score = Double.parseDouble(scanner.nextLine());
                if(score > 100 || score < 0 || score %1 != 0){
                    throw new ScoresException("Điểm là số nguyên dương, không được bé hơn 0 và lớn hơn 100");
            }
                break;

            }catch (ScoresException e){
                System.out.println(e.getMessage());
            } catch (Exception e ) {
                System.out.println("Vui lòng nhập số: ");
            }
        }

        Student student;
        student = new Student(code, name, gender, nameClass, score);
        return student;

    }


    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = ReadFile.readFile(path);
        List<Student> students = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            if (info.length == 5) {
                students.add(new Student(info[0], info[1], info[2], info[3], Double.parseDouble(info[4])));
            }
        }
        return students;
    }
    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student : students) {
            data += student.toString();
            data += "\n";
        }
        WriteFile.writeFile(path, data);
    }
}

