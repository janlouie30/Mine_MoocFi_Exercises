import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(item.getWeight() == 0) {
            items.add(item);
        }

        int temp = 0;
        if(!(items.isEmpty())) {
            for(Item x : items) {
                temp += x.getWeight();
            }
            if(temp < this.capacity) {
                items.add(item);
            }
        } else {
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
