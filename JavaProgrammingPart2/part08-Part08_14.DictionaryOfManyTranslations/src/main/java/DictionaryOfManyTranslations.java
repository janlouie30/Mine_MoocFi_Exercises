import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        dict.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> trans = dict.get(word);
        trans.add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        dict.remove(word);
    }

}
