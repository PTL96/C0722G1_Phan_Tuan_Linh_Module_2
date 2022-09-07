package ss3_Array.exercise;

import java.util.Arrays;

public class Add_array {

        public static void main(String[] args) {
            String[] arr = {"1", "2" , "3", "4", "5"};
            System.out.println("Mảng trước khi thêm:" + Arrays.toString(arr));
            int N = arr.length;
            arr = Arrays.copyOf(arr,N + 1);
            arr[N] = "6";
            System.out.println("Mảng sau khi thêm: "
                    + Arrays.toString(arr));
        }
    }


