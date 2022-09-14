package ss7_Abstractclass_interface.exercise1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[1] = new Square(3);
        shapes[2]= new Rectangle(2,5);
        shapes[3] = new Circle(9);
        for (Shape shape : shapes){
            ((Resizeable) shape).size(Math.floor(Math.random() * 100 + 1));
        }

    }
}
