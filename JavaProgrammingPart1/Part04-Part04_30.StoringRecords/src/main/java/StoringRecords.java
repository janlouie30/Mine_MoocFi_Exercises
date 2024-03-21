
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] parts = row.split(",");
                int age = Integer.parseInt(parts[1]);

                persons.add(new Person(row, age));
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }

        return persons;

    }
}
