
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Last number? ");
        int input = Integer.parseInt(scanner.nextLine());
        for(int x = 0; x <= input; x++) {
            sum = sum + x;
        }
        System.out.println("The sum is " + sum);
    }
}
