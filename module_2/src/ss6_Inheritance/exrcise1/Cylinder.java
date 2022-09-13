package ss6_Inheritance.exrcise1;

class Cylinder extends Circle {
    private double height = 5;
    private double longs = 10;
    private double wide = 6;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height, double longs, double wide) {
        super(radius, color);
        this.height = height;
        this.longs = longs;
        this.wide = wide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double Volume() {
        return height * longs * wide;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", longs=" + getLongs() +
                ", wide=" + getWide() +
                '}';
    }
}

