import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecipesFunctions {

    private ArrayList<Recipe> recipes;

    public RecipesFunctions() {
        recipes = new ArrayList<>();
    }

    public void add(Recipe daRecipe) {
        recipes.add(daRecipe);
    }

    public void readDaFiles(String file) {
        ArrayList<ArrayList<String>> outerList = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            ArrayList<String> current = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty() || !scanner.hasNextLine()) { // checker if the line is empty or it is the last line in
                                                               // the file
                    outerList.add(current);
                    current = new ArrayList<>();
                } else {
                    current.add(row);
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR! Unknown file!");
        }
        for (ArrayList<String> list : outerList) {
            Recipe allRecipe = new Recipe(list.get(0), Integer.parseInt(list.get(1)));
            for (int x = 2; x < list.size(); x++) {
                allRecipe.addIngredients(list.get(x));
            }
            recipes.add(allRecipe);
        }
    }

    public void printList() {
        for (Recipe currentRecipe : recipes) {
            System.out.println(currentRecipe);
        }
    }

    public void searchByName(String name) {
        for (Recipe currentRecipe : recipes) {
            if (currentRecipe.getFood().contains(name)) {
                System.out.println(currentRecipe);
            }
        }
    }

    public void searchByTime(int number) {
        for (Recipe currentRecipe : recipes) {
            if (currentRecipe.getCookTime() <= number) {
                System.out.println(currentRecipe);
            }
        }
    }

    public void searchByIngredient(String ingredient) {
        for (Recipe currentRecipe : recipes) {
            if (currentRecipe.getIngredients().contains(ingredient)) {
                System.out.println(currentRecipe);
            }
        }
    }
}
