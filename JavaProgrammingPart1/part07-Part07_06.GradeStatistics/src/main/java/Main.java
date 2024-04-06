import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your program here -- consider breaking the program into
        // multiple classes.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        Grades points = new Grades();
        UserInterface ui = new UserInterface(grades, scanner);

        ui.start();

        System.out.println();

        if (grades.isEmpty()) {
            System.out.println("The gradelist is empty!");
            System.out.println();
        } else {
            double allPointsAverage = points.getAverage(grades);
            double passingAverage = points.getPassingAverage(grades);
            double percentWhoPassed = points.getPassingPercentage(grades);

            System.out.println(points.printIt(allPointsAverage, passingAverage, percentWhoPassed));

            Gradebooks gradeDist = new Gradebooks(grades);
            System.out.println("Grade Distribution: ");
            gradeDist.startCompare();
        }

    }
}
