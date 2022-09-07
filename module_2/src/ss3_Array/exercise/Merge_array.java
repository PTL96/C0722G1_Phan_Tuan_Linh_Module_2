package ss3_Array.exercise;

import java.util.Arrays;

public class Merge_array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int length = array1.length + array2.length;
        int[] array3 = new int[length];
        int add = 0;
        for (int element : array1) {
            array3[add] = element;
            add++;
        }
        for (int element : array2) {
            array3[add] = element;
            add++;
        }
        System.out.println(Arrays.toString(array3));

    }
}
