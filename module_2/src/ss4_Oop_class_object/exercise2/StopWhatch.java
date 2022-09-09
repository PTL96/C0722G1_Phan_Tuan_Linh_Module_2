package ss4_Oop_class_object.exercise2;

public class StopWhatch {
    long startTime;
    long endTime;

    public double getStar() {
        return startTime;
    }

    public double getStop() {
        return endTime;
    }

    public StopWhatch() {
        this.startTime = System.currentTimeMillis();

    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }
    long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
