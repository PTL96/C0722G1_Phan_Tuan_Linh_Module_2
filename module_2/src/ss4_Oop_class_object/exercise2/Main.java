package ss4_Oop_class_object.exercise2;

public class Main {
    public static void main(String[] args) {
        StopWhatch stopWhatch = new StopWhatch();
        stopWhatch.start();
        for (long i =1; i <10000000000L; i++) i ++;
        stopWhatch.stop();
        System.out.println(stopWhatch.getElapsedTime()+" miliSecon");
    }
}
