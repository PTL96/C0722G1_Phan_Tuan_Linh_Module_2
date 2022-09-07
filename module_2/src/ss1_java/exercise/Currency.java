package ss1_java.exercise;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập USD cần chuyển đổi");
        usd = sc.nextDouble();
        double vnd = usd * 23000;
        System.out.println("Số tiền sau khi quy đổi:" + vnd);
    }
}
