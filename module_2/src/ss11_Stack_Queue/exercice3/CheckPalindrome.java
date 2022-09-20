package ss11_Stack_Queue.exercice3;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(chuoi.length() - i - 1);
            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlindrome.");
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlindrome.");
            }
            break;
        }
    }
}

