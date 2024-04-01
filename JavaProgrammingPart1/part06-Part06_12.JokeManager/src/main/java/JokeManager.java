import java.util.ArrayList;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        if (!jokes.contains(joke)) {
            jokes.add(joke);
        }
    }

    public String drawJokes() {
        if (jokes.isEmpty()) {
            return "You are the joke.";
        }

        int min = 0;
        int max = jokes.size() - 1;

        int randomInteger = (int) (Math.random() * (max - min + 1)) + min;
        String selectedJoke = jokes.get(randomInteger);

        return selectedJoke;
    }

    public void printJokes() {
        for (String x : jokes) {
            System.out.println(x);
        }
    }
}
