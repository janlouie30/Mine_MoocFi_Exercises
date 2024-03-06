
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int input = Integer.parseInt(scan.nextLine());
        if(input > 100) {
            System.out.println("Grade: incredible!");
        } else if (input <= 100 && input >= 90) {
            System.out.println("Grade: 5");
        } else if (input < 90 && input >= 80) {
            System.out.println("Grade: 4");
        } else if (input < 80 && input >= 70) {
            System.out.println("Grade: 3");
        } else if (input < 70 && input >= 60) {
            System.out.println("Grade: 2");
        } else if (input < 60 && input >= 50) {
            System.out.println("Grade: 1");
        } else if (input < 50 && input >= 0) {
            System.out.println("Grade: failed");
        } else {
            System.out.println("Grade: impossible!");
        }
    }
}
