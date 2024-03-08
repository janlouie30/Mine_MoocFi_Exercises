
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int input = Integer.parseInt(scan.nextLine());
        if(input <= 120 && input >= 0) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
