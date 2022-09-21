package ss12_Map_Tree.Model;

public class Product {
    private String code;
    private String nameProduct;
    private Double price;

    public Product() {
    }

    public Product(String code, String nameProduct, Double price) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: {" +"Mã sản phẩm: " +getCode()+ ", Tên sản phẩm: "+ getNameProduct()+", Giá bán: "+getPrice()+

                '}';
    }
}
