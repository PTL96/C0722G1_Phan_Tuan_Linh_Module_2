package Quan_ly_phuong_tien_giao_thong_MVC.Model;

public class Car extends Vehicle{
    private double seat;
    private String vehicleType;

    public Car(String licensePlates, String manufacturer, double year, String owner, String wattage) {
    }

    public Car(double seat, String vehicleType) {
        this.seat = seat;
        this.vehicleType = vehicleType;
    }

    public Car(String licensePlates, String manufacturer, double year, String owner) {
        super(licensePlates, manufacturer, year, owner);
    }

    public Car(String licensePlates, String manufacturer, double year, String owner, double seat, String vehicleType) {
        super(licensePlates, manufacturer, year, owner);
        this.seat = seat;
        this.vehicleType = vehicleType;
    }

    public Car(String licensePlates, String manufacturer, double year, String owner, String seat, String vehicleType) {
    }

    public double getSeat() {
        return seat;
    }

    public void setSeat(double seat) {
        this.seat = seat;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car: "+" Biển kiểm soát: "+getLicensePlates()+", Hãng sản xuất: "+getManufacturer()
                +", Năm sản xuất: "+getYear()+", Chủ sở hữu: "+getOwner()+", Số chỗ ngồi: "+getSeat()+", Kiểu loại xe: "+ getVehicleType();
    }
}
