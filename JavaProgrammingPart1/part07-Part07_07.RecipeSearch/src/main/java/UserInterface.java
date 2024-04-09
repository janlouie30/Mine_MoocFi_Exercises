import java.util.Scanner;

public class UserInterface {

    private Scanner scn;

    public UserInterface(Scanner scanner) {
        scn = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scn.nextLine();
        //String file = "recipes.txt"; // DEBUG
        RecipesFunctions runDaRecipe = new RecipesFunctions();
        runDaRecipe.readDaFiles(file);

        while (true) {
            printCommandList();
            System.out.println();
            System.out.print("Enter command: ");
            String cmd = scn.nextLine();
            System.out.println();
            if (cmd.equals("stop")) {
                break;
            }

            switch (cmd) {
                case "list":
                    runDaRecipe.printList();
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String daWord = scn.nextLine();
                    runDaRecipe.searchByName(daWord);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int daTime = Integer.parseInt(scn.nextLine());
                    runDaRecipe.searchByTime(daTime);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scn.nextLine();
                    runDaRecipe.searchByIngredient(ingredient);
                    break;

                default:
                    System.out.println("ERROR: Unknown Command!");
                    break;
            }
            System.out.println();
        }
    }

    private void printCommandList() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
