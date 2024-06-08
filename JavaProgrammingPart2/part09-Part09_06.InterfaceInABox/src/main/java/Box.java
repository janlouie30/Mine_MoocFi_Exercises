import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private int items;
    private ArrayList<Packable> packables;

    public Box(double maximumCapacity) {
        this.capacity = maximumCapacity;
        items = 0;
        packables = new ArrayList<>();
    }

    public void add(Packable item) {
        if(this.weight() + item.weight() <= capacity) {
            this.packables.add(item);
            items += 1;
        }
    }

    @Override
    public double weight() {
        double weight = 0.0;
        for(Packable x : packables) {
            weight += x.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items + " items, total weight " + this.weight() + " kg";
    }
}
