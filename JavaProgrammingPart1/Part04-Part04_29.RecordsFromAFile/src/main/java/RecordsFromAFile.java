
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String input = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(input))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] parts = row.split(",");
                int age = Integer.parseInt(parts[1]);
                if (age == 1) {
                    System.out.println(parts[0] + ", age: " + age + " year");
                } else {
                    System.out.println(parts[0] + ", age: " + age + " years");
                }

            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }
}
