
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archives> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            boolean isUnique = true;
            for (Archives archive : archives) {
                if (archive.getID().equals(id)) {
                    isUnique = false;
                    break;
                }
            }

            Archives item = new Archives(name, id);
            if (isUnique) {
                archives.add(item);
            }
        }
        System.out.println("==Items==");
        for (Archives x : archives) {
            System.out.println(x);
        }
    }
}
