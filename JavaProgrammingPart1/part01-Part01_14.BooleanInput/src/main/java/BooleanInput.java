
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean input = Boolean.valueOf(scanner.nextLine());
        if(input == true) {
            System.out.println("True or false? true");
        } else {
            System.out.println("True or false? false");
        }
    }
}
