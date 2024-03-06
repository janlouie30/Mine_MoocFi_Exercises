
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String input = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double doble = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean truOrPols = Boolean.parseBoolean(scan.nextLine());
        
        System.out.println("You gave the string " + input);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + doble);
        System.out.println("You gave the boolean " + truOrPols);
    }
}
