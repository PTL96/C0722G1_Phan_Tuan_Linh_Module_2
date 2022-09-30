package ss17_Binaryfile_Serialization.exercise1.View;

import ss17_Binaryfile_Serialization.exercise1.ProductController.Product_Controller;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        Product_Controller product_controller = new Product_Controller();
        product_controller.menuProduct();
    }
}
