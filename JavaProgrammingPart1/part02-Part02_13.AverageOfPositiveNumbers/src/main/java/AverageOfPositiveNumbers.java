
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, input = 0;
        
        while(true) {
            input = Integer.parseInt(scanner.nextLine());
            if(input == 0) {
                break;
            }
            
            if(input > 0) {
                count++;
                sum = sum + input;
            }
            
            //DEBUG
            //System.out.println("");
            //System.out.println("Sum: " + sum);
            //System.out.println("Count:" + count);
            //------
        }
        if (sum > 0) {
            System.out.println((1.0 * (sum)/count));
        } else {
            System.out.println("Cannot calculate the average");
        }   
    }
}
