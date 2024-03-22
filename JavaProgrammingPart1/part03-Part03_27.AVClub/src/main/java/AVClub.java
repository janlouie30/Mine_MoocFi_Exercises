
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            String[] parts = text.split(" ");

            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
        /*
         * for(int x = 0;x < parts.length; x++){
         * if(parts[x].contains("av")) {
         * System.out.println(parts[x]);
         * }
         * }
         */
    }
}
