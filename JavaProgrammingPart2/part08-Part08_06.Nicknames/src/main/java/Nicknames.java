
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicks = new HashMap<>();
        nicks.put("Matthew", "Matt");
        nicks.put("Michael", "Mix");
        nicks.put("Arthur", "Artie");

        System.out.println(nicks.get("Matthew"));
    }

}
