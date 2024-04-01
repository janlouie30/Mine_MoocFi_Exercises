import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scn;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.list = todo;
        this.scn = scanner;
    }

    public void stop() {
        System.exit(0);
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = scn.nextLine();

            if (cmd.equals("stop")) {
                this.stop();
            }

            switch (cmd) {
                case "add":
                    System.out.print("To add: ");
                    String addedWord = scn.nextLine();

                    list.add(addedWord);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int number = Integer.parseInt(scn.nextLine());

                    list.remove(number);
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }

        }
    }
}
