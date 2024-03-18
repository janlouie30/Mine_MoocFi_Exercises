
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> years = new ArrayList<>();
        
        String longestName = "";
        int longest = 0, sum = 0;
        
        while(true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            int year = Integer.parseInt(parts[1]);
            int nameLenght = parts[0].length();
            
            if(longest < nameLenght) {
                longest = nameLenght;
                longestName = parts[0];
            }
            
            sum = sum + year;
            years.add(year);
        }
        
        double ave = 1.0 * sum / years.size();
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ave);
    }
}
