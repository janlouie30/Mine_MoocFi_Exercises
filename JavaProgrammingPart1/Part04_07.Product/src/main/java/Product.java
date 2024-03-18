public class Product {
    
    private double price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct() {
        if(quantity == 1) {
            System.out.println(name + ", price " + price + ", " + quantity + " pc");
        } else if (quantity == 0) {
            System.out.println("No stock.");
        } else {
            System.out.println(name + ", price " + price + ", " + quantity + " pcs");
        }
        //System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
    
}
