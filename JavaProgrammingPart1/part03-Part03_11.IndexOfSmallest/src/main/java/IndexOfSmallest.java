
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            if(input == 9999){
                break;
            }
            
            list.add(input);
        }
        
        int smallest = list.get(0);
        for(int x = 0; x < list.size(); x++) {
            if(smallest > list.get(x)) {
                smallest = list.get(x);
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        for(int y = 0; y < list.size(); y++) {
            if(smallest == list.get(y)) {
                System.out.println("Found at index: " + y);
            }
        }
    }
}
