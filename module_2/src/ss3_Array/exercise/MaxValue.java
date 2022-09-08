package ss3_Array.exercise;
import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        System.out.println("Nhập số dòng");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột");
        n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[m][n];
        System.out.println("Nhập phần tử cho ma trận");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.println("Nhập phần tử thứ" + (i + j));
                array[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        int max = array[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        for (int[] arrj:array) {
            System.out.println(Arrays.toString(arrj));
        }

        System.out.println("Phần tử lớn nhất trong mảng 2 chiều đó là: " + max);
    }
}
