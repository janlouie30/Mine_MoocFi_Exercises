
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = 1;

        System.out.print("Give a number: ");
        int input = Integer.parseInt(scanner.nextLine());
        
        for(int x = 1;x<=input;x++){
            factorial = factorial * x;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
