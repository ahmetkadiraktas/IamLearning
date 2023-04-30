public class Product {
    private String name;
    private int quantity;
    private double price;
    private int productId;
    private static int idCounter=1;

    public Product() {
        this("Unknown", 0, 0.00);
    }
    public Product(String name, int quantity, double price) {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
        productId=idCounter;
        idCounter++;
    }
    public String getName() {
        return name;
    }
 
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public static int getIdCounter() {
        return idCounter;
    }
    
    public double getItemValue() {
        return price * quantity;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setPrice(double price) {
        if (price > 0.00) {
            this.price = price;
        } else {
            this.price = 0.00;
        }
    }

    
    public String toString() {
        return name + " - " + price;
    }
}
    
