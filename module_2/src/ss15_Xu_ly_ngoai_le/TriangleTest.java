package ss15_Xu_ly_ngoai_le;

import java.util.Scanner;

public class TriangleTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void checkEdge(double a, double b, double c) throws IllegalAccessException {
        if (a + b <= c || a + c <= b || c + b <= a) {
            throw new IllegalAccessException("Đây không phải là cạnh của tam giác");
        } else {
            System.out.println("Đây là cạnh tam giác");
        }

    }

    private static double checkEdge(double i) {
        while (true) {
            try {
                i = Double.parseDouble(scanner.nextLine());
                if (i <= 0) {
                    throw new IllegalAccessException("Số nhập vào phải lớn hơn 0");
                }
                break;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("Nhập cạnh a");
        a = checkEdge(a);
        System.out.println("Nhập cạnh b");
        b = checkEdge(b);
        System.out.println("Nhâp cạnh c");
        c = checkEdge(c);
        try {
            TriangleTest.checkEdge(a, b, c);
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
    }
}

