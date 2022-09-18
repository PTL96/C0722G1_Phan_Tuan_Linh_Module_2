package Quan_ly_phuong_tien_giao_thong_MVC.Model;

public class Truck extends Vehicle {
    private String tonnage;

    public Truck() {
    }

    public Truck(String tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String licensePlates, String manufacturer, double year, String owner) {
        super(licensePlates, manufacturer, year, owner);
    }

    public Truck(String licensePlates, String manufacturer, double year, String owner, String tonnage) {
        super(licensePlates, manufacturer, year, owner);
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Xe tải: "+"Biển kiểm soát: "+getLicensePlates()+", Hãng sản xuất: "+getManufacturer()
                +", Năm sản xuất: "+getYear()+", Chủ sở hữu: "+getOwner()+", Tải trọng: "+getTonnage();
    }
}
