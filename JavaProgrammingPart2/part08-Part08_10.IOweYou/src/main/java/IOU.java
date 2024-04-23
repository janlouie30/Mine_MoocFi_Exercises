import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> mapping;

    public IOU() {
        mapping = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        double howMuch = 0;
        if (mapping.get(toWhom) == null || mapping.get(toWhom) < 0) {
            howMuch += amount;
        } else {
            howMuch = mapping.get(toWhom) + amount;
        }
        mapping.put(toWhom, howMuch);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (mapping.get(toWhom) == null) {
            return 0;
        }

        return mapping.get(toWhom);
    }

}
