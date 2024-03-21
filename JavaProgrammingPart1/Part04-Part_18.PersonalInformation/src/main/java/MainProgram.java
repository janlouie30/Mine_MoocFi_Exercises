import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<PersonalInformation> personsInfo = new ArrayList<>();
        
        while(true) {
            System.out.print("First name: ");
            String first = reader.nextLine();
            
            if(first.isEmpty()) {
                break;
            }
            
            System.out.print("Last name: ");
            String last = reader.nextLine();
            System.out.print("Identification number: ");
            String id = reader.nextLine();
            
            personsInfo.add(new PersonalInformation(first,last,id));
        }
        
        System.out.println("");
        for(PersonalInformation person : personsInfo) {
            System.out.println(person);
        }
        
    }
}
