import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if(cart.containsKey(product)) {
            Item item = cart.get(product);
            item.increaseQuantity();
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }
    public int price() {
        int price = 0;
        for(Item x : cart.values()) {
            price += x.price();
        }
        return price;
    }
    public void print() {
        for(Item x : cart.values()) {
            System.out.println(x);
        }
    }
}
