package ss11_Stack_Queue.exercice1;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack1.push(i);
        }

        System.out.println("Mảng trước khi đảo: " + stack1);
        for (int i = 0; i <5 ; i++) {
            stack2.push(stack1.pop());
        }
        System.out.println("Mảng sau khi đảo: "+ stack2);
    }

}

