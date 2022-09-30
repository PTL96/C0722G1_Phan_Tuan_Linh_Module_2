package Quan_Ly_Hoc_Sinh_MVC.sevice;

import java.io.IOException;

public interface ITeacherSevice {
    void addTeacher() throws IOException;

    void displayAllTeacher() throws IOException;

    void removeTeacher() throws IOException;

    void searchNameTeacher() throws IOException;

    void searchIdTeacher() throws IOException;

    void sortNameTeacher() throws IOException;

}
