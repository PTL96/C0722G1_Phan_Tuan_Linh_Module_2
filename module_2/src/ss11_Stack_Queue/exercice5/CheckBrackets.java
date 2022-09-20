package ss11_Stack_Queue.exercice5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra");
        String expression = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String[] arrays = expression.split("");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].equals(")") || arrays[i].equals("(")) {
                stack.add(arrays[i]);
                queue.offer(arrays[i]);
            }
        }
        int size = stack.size();
        boolean checks;

        for (int i = 0; i < size; i++) {
            if (!stack.pop().equals(queue.poll())) {
                checks = false;
                break;

            }
            checks =true;

        }
        if (checks) {
            System.out.println("Dung");
        } else {
            System.out.println("Sai");

        }
    }
}

//       char temp;


//        for (int i = 0; i < expression.length(); i++) {
//            temp = expression.charAt(i);
//            if (temp == '(') {
//                stack.push(temp);
//            } else if (temp == ')') {
//                stack.push(temp);
//
//
//            }




