import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainProgram {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Items> itemLists = new ArrayList<>();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yyyy HH:mm:ss");
        
        while(true) {
            System.out.print("Name: ");
            String input = reader.nextLine();
            if(input.isEmpty()) {
                break;
            }
            
            LocalDateTime dateTime = LocalDateTime.now();
            String formattedDateTime = dateTime.format(format);
            itemLists.add(new Items(input,formattedDateTime));
        }
        
        for(Items item : itemLists) {
            System.out.println(item);
        }
    }
}
