import java.util.Scanner;

public class UserInterface {

    private Scanner scn;
    private Container firstContainer;
    private Container secondContainer;

    public UserInterface(Scanner scanner) {
        scn = scanner;
        firstContainer = new Container();
        secondContainer = new Container();
    }

    public void start() {
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scn.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int value = Integer.parseInt(parts[1]);

            switch (parts[0]) {
                case "add":
                    firstContainer.add(value);
                    break;
                case "move":
                    if (value >= firstContainer.contains()) {
                        int amountToMove = value - (value - firstContainer.contains());
                        firstContainer.remove(amountToMove);
                        secondContainer.add(amountToMove);
                    } else {
                        firstContainer.remove(value);
                        secondContainer.add(value);
                    }
                    break;
                case "remove":
                    secondContainer.remove(value);
                    break;
                default:
                    break;
            }

            System.out.println();
        }
    }

}
