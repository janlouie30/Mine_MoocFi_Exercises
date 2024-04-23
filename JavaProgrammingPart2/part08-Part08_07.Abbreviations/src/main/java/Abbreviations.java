import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> mapping;

    public Abbreviations() {
        mapping = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation.trim();
        mapping.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (mapping.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return mapping.get(abbreviation);
    }
}
