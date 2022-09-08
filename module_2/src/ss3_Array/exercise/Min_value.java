package ss3_Array.exercise;
import java.util.Arrays;
import java.util.Scanner;
//    [Bài tập] TÌM GIÁ TRỊ NHỎ NHẤT TRONG MẢNG.

public class Min_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số lượng phần tử");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("Số lượng phần tử phải lớn hơn 0");
            }
        } while (n < 0);
        int[] array = new int[n];
        System.out.println("Nhập phần tử");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(array));
        int min = MinValue(array);
        System.out.println("Số nhỏ nhất trong mảng là: " +array[min]);
    }
    public static int MinValue(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

}
