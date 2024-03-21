import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Books> bookLists = new ArrayList<>();
        
        while(true) {
            System.out.print("Title: ");
            String name = reader.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            String pages = reader.nextLine();
            System.out.print("Publication year: ");
            String year = reader.nextLine();
            
            bookLists.add(new Books(name,pages,year));
        }
        
        System.out.println();
        System.out.print("What information will be printed? ");
        String input = reader.nextLine();
        
        for(Books book : bookLists) {
            if(input.equals("everything")) {
                System.out.println(book);
            } else if (input.equals("name")) {
                System.out.println(book.getNames());
            } else if (input.equals("year")) {
                System.out.println(book.getYear());
            } else if (input.equals("pages")) {
                System.out.println(book.getPages());
            }
        }
    }
}
