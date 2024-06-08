import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> items;

    public OneItemBox() {
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(items.isEmpty()) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item x : items) {
            if(x.equals(item)) {
                return true;
            }
        }

        return false;
    }
    
    // DEBUG
    @Override
    public String toString() {
        String wew = "";
        for(Item x : items) {
            wew += x.getName() + " ";
        }
        return wew;
    }
}
