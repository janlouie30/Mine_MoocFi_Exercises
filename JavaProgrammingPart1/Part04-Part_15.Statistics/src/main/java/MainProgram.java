import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner reader = new Scanner(System.in);
        
        /*
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        */
        
        System.out.println("Enter numbers:");
        while(true) {
            int input = Integer.parseInt(reader.nextLine());
            
            if(input == -1) {
                break;
            }
            
            statistics.addNumber(input);
        }
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Averager: " + statistics.average());
        System.out.println();
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.evenSum());
        System.out.println("Sum of odd numbers: " + statistics.oddSum());
    }
}
