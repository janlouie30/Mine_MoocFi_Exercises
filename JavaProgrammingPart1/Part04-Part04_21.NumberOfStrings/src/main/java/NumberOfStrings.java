
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        while (true) {
            String input = reader.nextLine();
            if (input.equals("end")) {
                break;
            }

            count++;
        }

        System.out.println(count);
    }
}
