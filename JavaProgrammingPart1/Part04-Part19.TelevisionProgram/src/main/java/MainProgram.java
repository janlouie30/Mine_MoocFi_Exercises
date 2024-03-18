import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Televisions> tvProgs = new ArrayList<>();
        int time = 0;
        
        while(true) {
            System.out.print("Name: ");
            String name = reader.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            time = Integer.parseInt(reader.nextLine());
            
            tvProgs.add(new Televisions(name,time));
        }
        
        System.out.print("Program's maximum duration? ");
        int input = Integer.parseInt(reader.nextLine());
        for(Televisions tvs : tvProgs) {
            if(tvs.getTime() <= input) {
                System.out.println(tvs);
            }
        }
    }
}
