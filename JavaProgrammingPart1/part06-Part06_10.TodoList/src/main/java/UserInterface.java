import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private TodoList currentList;

    public UserInterface(TodoList daList, Scanner scn) {
        this.reader = scn;
        this.currentList = daList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = reader.nextLine().trim();

            if (cmd.equals("stop")) {
                break;
            }

            switch (cmd) {
                case "add":
                    taskAdd();
                    break;
                case "list":
                    taskList();
                    break;
                case "remove":
                    taskRemove();
                    break;
                default:
                    System.out.println("ERROR: Unknown Command!");
                    break;
            }
        }
    }

    public void taskAdd() {
        System.out.print("To add: ");
        String task = reader.nextLine();
        currentList.add(task);
    }

    public void taskList() {
        currentList.print();
    }

    public void taskRemove() {
        try {
            System.out.print("Which one is removed? ");
            int toBeRemoved = Integer.parseInt(reader.nextLine());
            currentList.remove(toBeRemoved);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Must contain a number or integer.");
        }
    }

}
