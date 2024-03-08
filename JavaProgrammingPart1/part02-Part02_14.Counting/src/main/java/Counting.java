
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.parseInt(scanner.nextLine());
        for(int x = 0; x <= input; x++) {
            System.out.println(x);
        }
    }
}
