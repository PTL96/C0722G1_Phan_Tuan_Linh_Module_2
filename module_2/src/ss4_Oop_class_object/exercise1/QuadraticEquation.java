package ss4_Oop_class_object.exercise1;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b * 4 * this.a * this.c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(this.getDiscriminant()))/(2*a);
    } public double getRoot2(){
        return (-b-Math.sqrt(this.getDiscriminant()))/(2*a);
    } public double getRoot(){
        return (-b/(2*a));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void solveTheEquation(){
        if (this.getDiscriminant() <0){
            System.out.println("Phương trình vô nghiệm");
        }else if (this.getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm kép x1 = x2" + this.getRoot());
        }else {
            double sqrt1 =Math.sqrt(b * b - 4 * a * c);
            System.out.println("Phương trình có  nghiệm 1 là:" + this.getRoot1());
            double sqrt = Math.sqrt(b * b - 4 * a * c);
            System.out.println("Phương trình có nghiệm 2 là:" + this.getRoot2());
        }
    }
   ;
}

