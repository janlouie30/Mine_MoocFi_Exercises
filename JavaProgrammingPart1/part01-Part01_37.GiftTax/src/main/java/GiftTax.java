
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int input = Integer.parseInt(scan.nextLine());
        if(input < 25000 && input >= 5000) {
            System.out.println("Tax: " + (100+(input-5000)*0.08));
        } else if (input < 55000 && input >= 25000) {
            System.out.println("Tax: " + (1700+(input-25000)*0.1));
        } else if (input < 200000 && input >= 55000) {
            System.out.println("Tax: " + (4700+(input-55000)*0.12));
        } else if (input < 1000000 && input >= 200000) {
            System.out.println("Tax: " + (22100+(input-200000)*0.15));
        } else if (input >= 1000000) {
            System.out.println("Tax: " + (142100+(input-1000000)*0.17));
        } else {
            System.out.println("No tax!");
        }
    }
}
