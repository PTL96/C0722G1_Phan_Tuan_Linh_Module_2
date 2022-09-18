package Quan_ly_phuong_tien_giao_thong_MVC.Model;

public class Motorcycle extends Vehicle{
    private String wattage;

    public Motorcycle() {
    }

    public Motorcycle(String wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String licensePlates, String manufacturer, double year, String owner) {
        super(licensePlates, manufacturer, year, owner);
    }

    public Motorcycle(String licensePlates, String manufacturer, double year, String owner, String wattage) {
        super(licensePlates, manufacturer, year, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Mô-tô: "+" Biển kiểm soát: "+getLicensePlates()+", Hãng sản xuất: "+getManufacturer()
                +", Năm sản xuất: "+getYear()+", Chủ sở hữu: "+getOwner()+", Phân khối: "+getWattage();
    }
}
