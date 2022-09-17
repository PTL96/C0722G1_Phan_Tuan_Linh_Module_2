package ss7_Abstractclass_interface.exercise1;

public class Square extends Rectangle implements Resizeable {
        Square() {
        }
        Square(double side) {
            super(side, side);
        }

        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            setLength(side);
            setWidth(side);
        }
        @Override
        public String toString() {
            return "A Square with side= " + getSide();
        }
    }



