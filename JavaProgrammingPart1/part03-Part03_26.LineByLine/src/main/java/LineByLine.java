
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = scanner.nextLine();
        String[] parts = text.split(" ");
        for(String part : parts) {
            System.out.println(part);
        }
        /*
        for(int x = 0; x < parts.length; x++) {
            System.out.println(parts[x]);
        }
        */
    }
}
