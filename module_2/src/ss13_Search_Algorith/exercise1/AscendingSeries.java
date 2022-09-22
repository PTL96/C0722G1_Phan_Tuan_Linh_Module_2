package ss13_Search_Algorith.exercise1;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần sắp xếp: ");
        String string = scanner.nextLine();
        LinkedList<String> max = new LinkedList<>();
        String subString = "" + string.charAt(0);
        for (int i = 1; i < string.length() - 1; i++) {
            if (string.charAt(i) < string.charAt(i + 1)) {
                subString += string.charAt(i);
                if (i == string.length() - 2 && string.charAt(i) < string.charAt(i + 1)) {
                    subString += string.charAt(i + 1);
                    max.add(subString);
                    break;
                }
            } else {
                subString += string.charAt(i);
                max.add(subString);
                subString = "";
            }
        }
        String maxSubString = max.get(0);
        for (String item : max) {
            if (item.length() > maxSubString.length()) {
                maxSubString = item;
            }
        }
        System.out.println(maxSubString);
    }
}
