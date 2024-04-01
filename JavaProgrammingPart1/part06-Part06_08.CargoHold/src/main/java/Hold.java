import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holdSuits;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holdSuits = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase current : holdSuits) {
            totalWeight += current.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            holdSuits.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase item : holdSuits) {
            item.printItems();
        }
    }

    @Override
    public String toString() {
        int suitsTotalWeight = 0;
        for (Suitcase current : holdSuits) {
            suitsTotalWeight += current.totalWeight();
        }

        String output = "";
        for (Suitcase items : holdSuits) {
            output = holdSuits.size() + " suitcases (" + suitsTotalWeight + " kg)";
        }
        return output;
    }
}
