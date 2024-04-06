import java.util.ArrayList;

public class Grades {
    private int sum;
    private int count;

    public Grades() {
        this.sum = 0;
        this.count = 0;
    }

    public double getAverage(ArrayList<Integer> grades) {
        this.sum = 0;
        for (int x : grades) {
            this.sum += x;
        }
        return 1.0 * this.sum / grades.size();
    }

    public double getPassingAverage(ArrayList<Integer> grades) {
        this.sum = 0;
        this.count = 0;
        for (int x : grades) {
            if (x >= 50) {
                this.sum += x;
                this.count++;
            }
        }
        return 1.0 * this.sum / this.count;
    }

    public double getPassingPercentage(ArrayList<Integer> grades) {
        return 100.0 * this.count / grades.size();
    }

    public String printIt(double allPoints, double passedAverage, double passedPercent) {
        String allPointsString = "Point average (all): ";
        String passedAverageString = "Point average (passing): ";
        String passedPercentString = "Pass percentage: ";

        allPointsString += allPoints;
        if (passedAverage > 0) {
            passedAverageString += passedAverage;
            passedPercentString += passedPercent;
        } else {
            passedAverageString += "-";
            passedPercentString += "-";
        }

        return allPointsString + "\n" + passedAverageString + "\n" + passedPercentString;
    }

}
