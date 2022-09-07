package ss3_Array.exercise;

public class Display {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < 5; j++) {
                if (j<i){
                    str.append(" ");
                }
            }
            str.append(count);
            for (int j = 1; j < count*2; j++) {
                str.append(" ");
            }
            str.append(count).append("\n");
            count++;
        }
        count = 4;
        for (int i = 1; i < 5; i++) {
            str.append(" ");
            for (int j = 0; j < 5; j++) {
                if (j<i){
                    str.append(" ");
                }
            }
            str.append(count);
            for (int j = 1; j < count*2; j++) {
                str.append(" ");
            }
            str.append(count).append("\n");
            count--;
        }
        System.out.println(str);
    }
}
