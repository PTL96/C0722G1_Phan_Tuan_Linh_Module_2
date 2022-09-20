package ss11_Stack_Queue.exercice4;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển sang nhị phân");
        Stack<Integer> stack = new Stack<>();
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());

        }

    }


}

