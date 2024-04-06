import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Integer> gradesList;
    private Scanner reader;

    public UserInterface(ArrayList<Integer> grades, Scanner scanner) {
        this.gradesList = grades;
        this.reader = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            try {
                int input = Integer.parseInt(reader.nextLine());
                if (input == -1) {
                    break;
                }

                if (input >= 0 && input <= 100) {
                    gradesList.add(input);
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Put only numbers!");
            }
        }
    }
}
