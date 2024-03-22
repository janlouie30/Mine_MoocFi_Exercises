
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            String[] parts = text.split(" ");
            for (int x = 0; x < parts.length; x++) {
                System.out.println(parts[x]);
            }
        }
    }
}
