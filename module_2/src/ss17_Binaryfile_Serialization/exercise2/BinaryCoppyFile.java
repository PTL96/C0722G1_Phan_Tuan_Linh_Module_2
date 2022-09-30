package ss17_Binaryfile_Serialization.exercise2;

import java.io.*;

public class BinaryCoppyFile {
    public static void main(String[] args) throws IOException {
        File fileSource = new File("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
        if (!fileSource.exists()) {
            System.out.println("File nguồn ko tồn tại, tự động tạo file");
            fileSource.createNewFile();
        } else {
            System.out.println("File nguồn đã tồn tại");
        }
        FileOutputStream fiswrite = new FileOutputStream(fileSource);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fiswrite);
        objectOutputStream.writeObject("we cant but i can");
        objectOutputStream.close();
        FileInputStream fis = new FileInputStream(fileSource);

        File fileTarget = new File("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
        if (!fileTarget.exists()) {
            System.out.println("file đích chưa tồn tại, tự động tạo file");
            fileTarget.createNewFile();
        } else {
            System.out.println("File đích đã tồn tại");
        }
        FileOutputStream fos = new FileOutputStream(fileTarget);
        int i = -1;
        byte[] bytes = new byte[1024];// Đọc 10 byte 1 thời điểm
        while ((i = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, i);
        }
        long countByte = fileSource.length();
        fis.close();
        fos.close();
        System.out.println("Copy file hoàn thành");
        System.out.println("Số bytes đếm đc là: " + countByte + " Bytes");
    }
}
