
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("First number? ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int end = Integer.parseInt(scanner.nextLine());
        
        for(int x = start; x <= end; x++) {
            sum = sum + x;
        }
        
        System.out.println("The sum is " + sum);
    }
}
 