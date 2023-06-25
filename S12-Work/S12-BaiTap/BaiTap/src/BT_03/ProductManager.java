package BT_03;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private static ProductService productService;
    private static ProductController productController = new ProductController();
    private static Scanner scanner;

    public static void main(String[] args) {
        productController = new ProductController();
        scanner = new Scanner(System.in);
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            showProduct();
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Edit products");
            System.out.println("4. Sort products");
            System.out.println("5. Search product by name");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    sortMenu();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);


    }

    public static void sortMenu() {
        while (true) {
            System.out.println("====================SortMenu========================");
            System.out.println("1.Gradual increase in price:");
            System.out.println("2.Descending by price:");
            System.out.println("3.Back:");
            System.out.println("Chose:");
            int choice = Config.getInteger();
            switch (choice) {
                case 1:
                    sortProductByPriceUp();
                    break;
                case 2:
                    sortProductByPriceDown();
                case 3:
                    return;
            }
        }
    }

    public static void addProduct() {
        Product newProduct = new Product();
        int newId = productController.getNewId();
        newProduct.setId(newId);
        System.out.println("New ID " + newId);
        newProduct.inputData();
        productController.addProduct(newProduct);
    }

    public static void removeProduct() {
        System.out.println("Enter product ID  to remove");
        int id = scanner.nextInt();
        productController.removeProduct(id);
        System.out.println("Product Remove!!!!");
    }

    public static void showProduct() {
        if (productController.getSize() == 0) {
            System.out.println("Product Not Found");
        }
        productController.displayProduct();
    }

    private static void updateProduct() {
        System.out.println("Enter product ID to update");
        int idEdit = Config.getInteger();
        Product editProduct = productController.findById(idEdit);
        System.out.println(editProduct);
        if (editProduct == null) {
            System.err.println("Product Not Found");
            return;
        }
        System.out.println("Product Editing");
        editProduct.displayData();
        editProduct.inputData();
        productController.addProduct(editProduct);
        System.out.println("Product Updated!!!!");
    }

    public static void searchProduct() {
        System.out.println("Enter product name to search");
        String search = Config.getString();
        productController.searchProduct(search);
    }

    public static void sortProductByPriceUp() {
        Collections.sort(productController.getAll(), new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare((int) o1.getPrice(), (int) o2.getPrice());
            }
        });
        showProduct();
    }

    public static void sortProductByPriceDown() {
        Collections.sort(productController.getAll(), new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare((int) o2.getPrice(), (int) o1.getPrice());
            }
        });
        showProduct();
    }

}
