package BT_03;

import java.util.ArrayList;

public class ProductController {
    private ProductService productService = new ProductService();

    public ArrayList<Product> getAll() {
        return  productService.getAll();

    }

    public int getSize() {
        return productService.getSize();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

 public Product findById(int id) {
        productService.findById(id);
     return null;
 }

    public void removeProduct(int id) {
        productService.removeProduct(id);
    }

    public int getNewId() {
        return productService.getNewId();
    }

    public void displayProduct() {
        productService.displayProduct();
    }
    public void searchProduct(String name) {productService.searchProduct(String.valueOf(name));}

}
