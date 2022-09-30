package ss17_Binaryfile_Serialization.exercise1.Sevice;

import java.io.IOException;

public interface IProduct {

    void addProduct() throws IOException;

    void displayAllProduct() throws IOException;

    void removeProduct() throws IOException;

    void editProduct() throws IOException;

    void searchProduct() throws IOException;

    void sortProduct() throws IOException;
}
