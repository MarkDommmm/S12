package BT_03;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inputData() {
        System.out.println("Enter product name: ");
        this.name = Config.getString();
        System.out.println("Enter product price: ");
        this.price = Config.getDouble();
        System.out.println("Enter product quantity: ");
        this.quantity = Config.getInteger();
    }



    public void displayData() {
        System.out.println("--------------------PRODUCT---------------------");
        System.out.println("Product ||" +
                "id : " + id + " name : " + name + "\n" +
                " price : " + price + " quantity : " + quantity + "||");
    }
}
