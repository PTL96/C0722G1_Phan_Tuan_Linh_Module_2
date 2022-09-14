package ss7_Abstractclass_interface.exercise2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        Circle[] array = new Circle[4];
        shapes[0] = new Circle(9);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(6,10);
        for(Shape shape: shapes){
            System.out.println(shape);
            if(shape instanceof Square){
                System.out.println(((Square)shape).howToColor());
            }
        }
    }
}

