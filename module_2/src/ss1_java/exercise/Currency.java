package ss1_java.exercise;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập USD cần chuyển đổi");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Số tiền sau khi quy đổi:" + quydoi);
    }
}
