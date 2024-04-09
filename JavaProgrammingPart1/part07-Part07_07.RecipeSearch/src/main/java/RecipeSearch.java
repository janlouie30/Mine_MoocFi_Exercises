import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        UserInterface ui = new UserInterface(inputReader);

        ui.start();
    }
}
