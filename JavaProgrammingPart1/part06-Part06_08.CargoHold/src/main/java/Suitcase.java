import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item current : items) {
            totalWeight += current.getWeight();
        }
        if (totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item current : items) {
            totalWeight += current.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item returnObj = items.get(0);
        int heaviest = returnObj.getWeight();

        for (Item item : items) {
            if (item.getWeight() > heaviest) {
                heaviest = item.getWeight();
                returnObj = item;
            }
        }

        return returnObj;

    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        String output = "";
        if (items.isEmpty() || items.size() == 0) {
            output = "no items (0 kg)";
        } else if (items.size() == 1) {
            output = "1 item (" + totalWeight + " kg)";
        } else {
            output = items.size() + " items (" + totalWeight + " kg)";
        }
        return output;
    }
}