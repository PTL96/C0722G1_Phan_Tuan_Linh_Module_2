package ss17_Binaryfile_Serialization.exercise1.ProductController;

import ss17_Binaryfile_Serialization.exercise1.Sevice.IProduct;
import ss17_Binaryfile_Serialization.exercise1.Sevice.impl.ProductSevice;

import java.io.IOException;
import java.util.Scanner;

public class Product_Controller {
    private static final IProduct iproduct = new ProductSevice();
        private final Scanner scanner = new Scanner(System.in);

        public void menuProduct() throws IOException {
            while (true) {
                System.out.println("************************ - MENU QUẢN LÝ SẢN PHẨM - *************************");
                System.out.println("Chào mừng bạn đến với chương trình QUẢN LÝ SẢN PHẨM CỦA LINH");
                System.out.println("1. Hiển thị danh sách sản phẩm");
                System.out.println("2. Thêm mới sản phẩm");
                System.out.println("3. Sửa sản phẩm");
                System.out.println("4. Xóa sản phẩm");
                System.out.println("5. Tìm sản phẩm");
                System.out.println("6. Sắp xếp sản phẩm");
                System.out.println("7. Thoát");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        iproduct.displayAllProduct();
                        break;
                    case 2:
                        iproduct.addProduct();
                        break;
                    case 3:
                        iproduct.editProduct();
                        break;
                    case 4:
                        iproduct.removeProduct();
                        break;
                    case 5:
                        iproduct.searchProduct();
                        break;
                    case 6:
                        iproduct.sortProduct();
                        break;
                    case 7:
                        return;
                }
            }
        }

}



