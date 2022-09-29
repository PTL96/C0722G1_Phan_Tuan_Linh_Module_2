package ss16_TextFile.exercice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class TestFile_Main {
    public static void testFile(String fileTest){
        try {
            File file = new File(fileTest);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
                sum = line.length();
            }
            bufferedReader.close();
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File không tồn tại hoặc có lỗi");
        }


    }
    public static void main(String[] args) {
        System.out.println("Nhập file cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        TestFile_Main testFile_main = new TestFile_Main();
        testFile(test);
    }

}
