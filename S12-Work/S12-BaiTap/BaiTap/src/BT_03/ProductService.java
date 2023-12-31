package BT_03;

import java.util.*;

public class ProductService {
    private ArrayList<Product> products;

    public ProductService() {
        products = new ArrayList<>();
        products.add(new Product(1, "Chair", 1000, 10));
        products.add(new Product(2, "Table", 999, 10));
    }

    public ArrayList getAll(){

        return products;

    }
    public int getSize(){
        return products.size();
    }

    public void addProduct(Product product) {
       if (findById(product.getId())==null){
           products.add(product);
       }else {
           products.set(products.indexOf(findById(product.getId())),product);
       }

    }
    public Product findById(int id) {
        for (Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(int id) {
        if (findById(id)==null){
            System.out.println("Product not found");
        }
        products.remove(findById(id));
    }
    public void displayProduct( ){
        for (Product pproduct: products) {
            System.out.println("-----------------------------------------");
            System.out.println("Product ||" +
                    "id : " + pproduct.getId() + " name : " + pproduct.getName() + "\n" +
                    " price : " + pproduct.getPrice() + " quantity : " + pproduct.getPrice() + "||");
        }
    }
    public void searchProduct(String name){
        boolean flag  = false;
        for (Product product: products) {
            if (product.getName().equals(name)){
                System.out.println("Product Search: ");
                product.displayData();
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Product not found");
        }
    }
    public int getNewId(){
        int maxId = 0;
        for (Product product: products) {
            if (product.getId()>maxId){
                maxId = product.getId();
            }
        }
        return maxId+1;
    }

}
