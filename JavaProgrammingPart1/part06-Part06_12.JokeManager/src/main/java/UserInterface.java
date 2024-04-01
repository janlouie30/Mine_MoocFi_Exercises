import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class UserInterface {

    private JokeManager jokes; // the list of jokes
    private Scanner scn;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scn = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop /n");

            String choice = scn.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scn.nextLine();
                    jokes.addJoke(joke);
                    break;
                case "2":
                    jokes.drawJokes();
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    jokes.printJokes();
                    break;
                case "X":
                    System.exit(0);
                    break;
                case "x":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

}
