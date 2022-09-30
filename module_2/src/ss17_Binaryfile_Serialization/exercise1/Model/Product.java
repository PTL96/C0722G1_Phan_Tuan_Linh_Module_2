package ss17_Binaryfile_Serialization.exercise1.Model;

public  class Product {
    private String code;
    private String nameProduct;
    private String manufacturer;
    private Double price;
    private String other;

    public Product(String code, String nameProduct, double price, String other) {
    }

    public Product(String code, String nameProduct, String manufacturer, Double price, String other) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
        this.other = other;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
