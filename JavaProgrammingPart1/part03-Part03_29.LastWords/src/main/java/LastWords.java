
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = scanner.nextLine();
        String[] parts = text.split(" ");
        
        System.out.println(parts[parts.length-1]);
    }
}
