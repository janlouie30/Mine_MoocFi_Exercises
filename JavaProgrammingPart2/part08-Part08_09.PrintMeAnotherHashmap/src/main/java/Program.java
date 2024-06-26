import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashMap) {
        for (Book x : hashMap.values()) {
            System.out.println(x);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        for (Book x : hashMap.values()) {
            if (x.getName().contains(text)) {
                System.out.println(x);
            }
        }
    }

}
