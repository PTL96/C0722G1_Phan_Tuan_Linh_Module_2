package Quan_Ly_Hoc_Sinh_MVC.sevice;

import java.io.IOException;

public interface IStudentSevice {
    void addStudent() throws IOException;

    void displayAllStudent() throws IOException;

    void removeStudent() throws IOException;

    void searchNameStudent() throws IOException;

    void searchIdStudent() throws IOException;

    void sortNameStudent() throws IOException;


}
