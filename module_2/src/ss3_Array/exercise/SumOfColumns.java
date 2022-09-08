package ss3_Array.exercise;

import java.util.Scanner;

public class SumOfColumns {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

       System.out.println("Nhập số cột muốn tính tổng: ");
        Scanner scanner = new Scanner(System.in);
       int columns = Integer.parseInt(scanner.nextLine());
       int total = 0;
       for (int i = 0; i < array[0].length; i++) {
           total += array[i][columns];
       }
       System.out.println("Tổng của cột " + columns + " là: " + total);
    }
}
