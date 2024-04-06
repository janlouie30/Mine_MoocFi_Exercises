import java.util.ArrayList;

public class Gradebooks {
    private ArrayList<Integer> gradeList;
    private int[] gradeCounts;

    public Gradebooks(ArrayList<Integer> grades) {
        this.gradeList = grades;
        this.gradeCounts = new int[6];
    }

    public void startCompare() {
        for (int y : this.gradeList) {
            if (y < 50) {
                this.gradeCounts[0]++;
            } else if (y < 60) {
                this.gradeCounts[1]++;
            } else if (y < 70) {
                this.gradeCounts[2]++;
            } else if (y < 80) {
                this.gradeCounts[3]++;
            } else if (y < 90) {
                this.gradeCounts[4]++;
            } else if (y >= 90) {
                this.gradeCounts[5]++;
            }
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < this.gradeCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
