import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if(history.isEmpty()) {
            return 0.0;
        }

        double daNumber = history.get(0);
        for(double x : history) {
            if(x > daNumber) {
                daNumber = x;
            }
        }

        return daNumber;
    }
    public double minValue() {
        if(history.isEmpty()) {
            return 0.0;
        }

        double daNumber = history.get(0);
        for(double x : history) {
            if(x < daNumber) {
                daNumber = x;
            }
        }

        return daNumber;
    }
    public double average() {
        if(history.isEmpty()) {
            return 0.0;
        }

        double daNumber = 0;
        for(double current : history) {
            daNumber += current;
        }

        return daNumber / history.size();
    }
}
