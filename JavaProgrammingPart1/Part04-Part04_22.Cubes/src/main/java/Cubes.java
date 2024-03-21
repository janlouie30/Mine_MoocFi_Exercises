
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            String input = reader.nextLine();
            if (input.equals("end")) {
                break;
            }

            int number = Integer.parseInt(input);
            System.out.println(number * number * number);
        }
    }
}
