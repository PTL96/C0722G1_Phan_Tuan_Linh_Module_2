package ss3_Array.exercise;

public class SumArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính là: " + sum);
    }
}
