package ss12_Map_Tree.Sevice.impl;

import ss12_Map_Tree.Model.Product;
import ss12_Map_Tree.Sevice.IProduct;

import java.util.*;

public class Product_Sevice implements IProduct {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Mời bạn nhập mã sản phẩm cần xóa ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa sản phẩm này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    productList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy mã cần xóa.");
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Mời bạn nhập mã sản phẩm cần sửa: ");
        String code = scanner.nextLine();
        boolean isExisted = false;
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getCode().equals(code)) {
                isExisted = true;
                productList.set(i, this.infoProduct());
                System.out.println("Cập nhật thông tin thành công");
                break;
            }

        }
        if (!isExisted) {
            System.out.println("Mã sản phẩm này không tồn tại, vui lòng nhập lại");
        }
    }

    @Override
    public void searchProduct() {
        int count = 0;
        System.out.println("Vui lòng nhập mã sản phẩm muốn tìm kiếm");
        String name = scanner.nextLine();
        for (Product product : productList) {
            if (product.getNameProduct().contains(name)) {
                System.out.println(product);
                count++;
            }
        }
        if (count < 0) {
            System.out.println("Không có sản phẩm cần tìm kiếm trong Menu" + name);
        }
    }

    @Override
    public void sortProduct() {
        int choice = Integer.parseInt(scanner.nextLine());
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;

                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product infoProduct() {
        System.out.println("Mời bạn nhập mã sản phẩm");
        String code = scanner.nextLine();
        System.out.println("Mời bạn nhập tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        Product product;
        product = new Product(code, nameProduct, (double) price);
        return product;
    }

}
