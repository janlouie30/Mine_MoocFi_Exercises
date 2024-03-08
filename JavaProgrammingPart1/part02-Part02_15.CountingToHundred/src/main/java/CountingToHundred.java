
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.parseInt(scanner.nextLine());
        while(input <= 100) {
            System.out.println(input);
            input++;
        }
    }
}
