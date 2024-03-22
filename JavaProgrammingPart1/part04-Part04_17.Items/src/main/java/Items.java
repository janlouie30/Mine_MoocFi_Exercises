
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Scanner reader = new Scanner(System.in);
        ArrayList<Item> itemLists = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            }

            itemLists.add(new Item(input));
        }

        for (Item item : itemLists) {
            System.out.println(item);
        }

    }
}
