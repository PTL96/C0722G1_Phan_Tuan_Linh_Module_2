package ss3_Array.exercise;
import java.util.Scanner;

public class Remove_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số lượng phần tử của mảng");
            n = Integer.parseInt(scanner.nextLine());
            if(n<0){
                System.out.println("Số lượng phần tử phải lớn hơn 0");
            }
        }while (n<0);
        int[] arr = new int[n];
        System.out.println("Nhập phần tử");
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập phần tử "+i);
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        int m;
        int index = 0;
        System.out.println("Nhập phần tử muốn xóa trong mảng");
        m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            if(arr[i]!=m){
                index = arr[i];
                index++;
            }
            n = index;
        }
        System.out.println("Mảng còn lại sau khi xóa phần tử " + m + " là: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
