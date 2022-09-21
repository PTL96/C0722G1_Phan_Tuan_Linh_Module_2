package ss12_Map_Tree.Controller;

import ss12_Map_Tree.Sevice.IProduct;
import ss12_Map_Tree.Sevice.impl.Product_Sevice;

import java.util.Scanner;

public class Product_Controller {
        private static final IProduct iProduct = new Product_Sevice();
        private static final Scanner scanner = new Scanner(System.in);

        public static void menuProduct() {
            while (true) {
                System.out.println("************************ - MENU SẢN PHẨM - *************************");
                System.out.println("Chào mừng bạn đến với siêu thị");
                System.out.println("1. Vui lòng ấn phím 1 để hiển thị danh sách sản phẩm");
                System.out.println("2. Vui lòng ấn phím 2 để thêm mới sản phẩm");
                System.out.println("3. Vui lòng ấn phím 3 để tìm kiếm sản phẩm");
                System.out.println("4. Vui lòng ấn phím 4 để sửa sản phẩm");
                System.out.println("5. Vui lòng ấn phím 5 để xóa sản phẩm");
                System.out.println("6. Vui lòng ấn phím 6 để sắp xếp theo giá bán");
                System.out.println("7. Ấn phím 7 để 'Thoát khỏi Menu' ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        iProduct.displayAllProduct();
                        break;
                    case 2:
                        iProduct.addProduct();
                        break;
                    case 3:
                        iProduct.searchProduct();
                        break;
                    case 4:
                        iProduct.editProduct();
                        break;
                    case 5:
                        iProduct.removeProduct();
                        break;
                    case 6:
                        iProduct.sortProduct();

                        break;
                    case 7:
                        return;
                }
            }
        }
    }

