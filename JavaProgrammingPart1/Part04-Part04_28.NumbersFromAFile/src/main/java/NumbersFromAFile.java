
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lists = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int row = Integer.parseInt(reader.nextLine());
                lists.add(row);
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }

        int totalNumber = 0;

        for (int x : lists) {
            if (x >= lowerBound && x <= upperBound) {
                totalNumber++;
            }
        }

        System.out.println("Numbers: " + totalNumber);

    }

}
