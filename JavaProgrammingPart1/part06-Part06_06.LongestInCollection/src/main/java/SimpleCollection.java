
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestName = this.elements.get(0);

        int longest = 0;
        for (String x : elements) {
            if (x.length() > longest) {
                longestName = x;
                longest = x.length();
            }
        }

        return longestName;
    }

}
