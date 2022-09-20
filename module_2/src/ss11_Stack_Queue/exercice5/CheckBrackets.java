package ss11_Stack_Queue.exercice5;

import java.util.Stack;

class Bracket {

    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)   ";
        String[] strArr = str.split("");
        Stack<String> stack1 = new Stack<>();
        boolean check = true;
        String left = "";

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("(")) {
                stack1.push(strArr[i]);
            } else if (strArr[i].equals(")")) {
                if (stack1.isEmpty()) {
                    check = false;
                    break;
                } else {
                    left = stack1.pop();
                    if (!left.equals("(") || !strArr[i].equals(")")) {
                        check = false;
                        break;
                    }
                }
            }
            if (i == strArr.length - 1) {
                check = stack1.isEmpty();
            }
        }

        if (check) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");

        }
    }
}