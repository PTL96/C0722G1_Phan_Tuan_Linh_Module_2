package Quan_ly_phuong_tien_giao_thong_MVC.Model;

public abstract class Vehicle {
    private String licensePlates;
    private String manufacturer;
    private double year;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlates, String manufacturer, double year, String owner) {
        this.licensePlates = licensePlates;
        this.manufacturer = manufacturer;
        this.year = year;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates='" + licensePlates + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
