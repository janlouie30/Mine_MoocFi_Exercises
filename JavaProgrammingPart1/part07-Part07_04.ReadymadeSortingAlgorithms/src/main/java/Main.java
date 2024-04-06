import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        Main.sort(array);
        String[] newArray = new String[array.length];
        System.out.println();
        for (int x = 0; x < array.length; x++) {
            newArray[x] = Integer.toString(array[x]);
        }
        Main.sort(newArray);
        System.out.println();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int x : array) {
            integers.add(x);
        }
        Main.sortIntegers(integers);
        System.out.println();
        ArrayList<String> strings = new ArrayList<>();
        for (int x : array) {
            strings.add(Integer.toString(x));
        }
        Main.sortStrings(strings);
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);

    }
}
