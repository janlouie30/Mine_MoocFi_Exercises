import java.util.Scanner;

public class UserInterface {
    private Scanner scn;

    public UserInterface(Scanner scanner) {
        scn = scanner;
    }

    public void start() {
        BirdFunctions runDaFunction = new BirdFunctions();
        while (true) {
            System.out.print("? ");
            String cmd = scn.nextLine().trim();

            if (cmd.equals("Quit")) {
                break;
            }

            switch (cmd) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scn.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scn.nextLine();
                    runDaFunction.addTranslations(name, latinName);
                    break;
                case "Observation":
                    System.out.print("Birds? ");
                    String bird = scn.nextLine();
                    runDaFunction.birdsObs(bird);
                    break;
                case "All":
                    runDaFunction.printAll();
                    break;
                case "One":
                    System.out.print("Birds? ");
                    String birdie = scn.nextLine();
                    runDaFunction.printOne(birdie);
                    break;

                default:
                    System.out.println("ERROR! Unknown Command!");
                    break;
            }
        }
    }
}
