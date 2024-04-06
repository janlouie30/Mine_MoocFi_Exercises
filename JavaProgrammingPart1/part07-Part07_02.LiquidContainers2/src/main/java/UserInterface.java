import java.util.Scanner;

public class UserInterface {

    private Container firstLevel;
    private Container secondLevel;
    private Scanner scanner;

    public UserInterface(Container first, Container second, Scanner scn) {
        this.firstLevel = first;
        this.secondLevel = second;
        this.scanner = scn;
    }

    public void stop() {
        System.exit(0);
    }

    public void start() {
        while (true) {
            System.out.println("First: " + firstLevel);
            System.out.println("Second: " + secondLevel);
            String cmd = scanner.nextLine();

            if (cmd.equals("quit")) {
                this.stop();
            }

            String[] parts = cmd.split(" ");
            int amount = Integer.parseInt(parts[1]);

            switch (parts[0]) {
                case "add":
                    firstLevel.add(amount);
                    break;
                case "move":
                    firstLevel.remove(amount);
                    secondLevel.add(amount);
                    break;
                case "remove":
                    secondLevel.remove(amount);
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }

}
