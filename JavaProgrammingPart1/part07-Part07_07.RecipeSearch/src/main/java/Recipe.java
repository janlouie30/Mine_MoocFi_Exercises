import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe() {
    }

    public Recipe(String food, int time) {
        name = food;
        cookTime = time;
        ingredients = new ArrayList<>();
    }

    public String getFood() {
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(String item) {
        ingredients.add(item);
    }

    public String toString() {
        return this.getFood() + ", cooking time: " + this.getCookTime();
    }

}
