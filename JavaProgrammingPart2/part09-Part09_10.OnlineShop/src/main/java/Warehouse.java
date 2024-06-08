import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Warehouse {

    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Warehouse() {
        price = new HashMap<>();
        stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product,price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if(!price.containsKey(product)) {
            return -99;
        }

        return price.get(product);
    }

    public int stock(String product) {
        if(!stock.containsKey(product)) {
            return 0;
        }
        return stock.get(product);
    }

    public boolean take(String product) {
        if(!stock.containsKey(product)) {
            return false;
        }

        int temp = stock.get(product);

        if(temp > 0) {
            int remain = temp - 1;    

            if(remain >= 0) {
                stock.put(product, remain);
            }
        }

        return temp > 0;
    }
    
    public Set<String> products() {
        return price.keySet();
    }

}
