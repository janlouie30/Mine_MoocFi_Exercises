public class Item {

    private String product;
    private int quantity;
    private int price;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        quantity = qty;
        price = unitPrice;
    }

    public int price() {
        return quantity * price;
    }

    public void increaseQuantity() {
        quantity++;
    }

    @Override
    public String toString() {
        return product + ": " + quantity;
    }
}
