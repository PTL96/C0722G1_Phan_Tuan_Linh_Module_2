package ss2_for.exercise.exercise2;

public class Prime {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int n = 2;
        while (count < number) {
            int value = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    value += 1;
                }
            }
            if (value == 0) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
