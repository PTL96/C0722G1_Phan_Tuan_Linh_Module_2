package ss17_Binaryfile_Serialization.exercise1.Sevice.impl;

import Quan_Ly_Hoc_Sinh_MVC.Utils.ReadFile;
import Quan_Ly_Hoc_Sinh_MVC.Utils.WriteFile;
import ss17_Binaryfile_Serialization.exercise1.Model.Product;
import ss17_Binaryfile_Serialization.exercise1.Sevice.IProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductSevice implements IProduct {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() throws IOException {
        productList = readProductFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công");
        writeStudentFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv", productList);
    }

    @Override
    public void displayAllProduct() throws IOException {

        productList = readProductFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void removeProduct() throws IOException {
        productList = readProductFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
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
        writeStudentFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv", productList);
    }

    @Override
    public void editProduct() throws IOException {
        productList = readProductFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
        System.out.println("Mời bạn nhập mã sản phẩm cần sửa: ");
        String code = scanner.nextLine();
        boolean isExisted = false;
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getCode().equals(code)) {
                isExisted = true;
                productList.set(i, this.infoProduct());
                System.out.println("Cập nhật thông tin thành công");
            }

        }
        if (!isExisted) {
            System.out.println("Mã sản phẩm này không tồn tại, vui lòng nhập lại");
        }
        writeStudentFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv", productList);
    }

    @Override
    public void searchProduct() throws IOException {
        productList = readProductFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
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
    public void sortProduct() throws IOException {
        productList = readProductFile("module_2/src/ss17_Binaryfile_Serialization/exercise1/Data/Product.csv");
        System.out.println("Sắp xếp theo giá thành công, vui lòng ấn phím 1 để hiển thị lại danh sách");
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
        System.out.println("Mời bạn nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Ghi chú");
        String other = scanner.nextLine();
        Product product;
        product = new Product(code, nameProduct, (double) price, other);
        return product;
    }

    public static List<Product> readProductFile(String path) throws IOException {
        List<String> strings = ReadFile.readFile(path);
        List<Product> products = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            if (info.length == 5) {
                products.add(new Product(info[0], info[1], info[2], Double.parseDouble(info[3]), info[4]));
            }
        }
        return products;
    }

    public static void writeStudentFile(String path, List<Product> products) throws IOException {
        String data = "";
        for (Product product : products) {
            data += product.toString();
            data += "\n";
        }
        WriteFile.writeFile(path, data);
    }


}

