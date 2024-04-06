import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int x : array) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexSmallest = 0;
        int temp = array[0];
        for (int x = 0; x < array.length; x++) {
            if (array[x] < temp) {
                temp = array[x];
                indexSmallest = x;
            }
        }
        return indexSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexSmallest = startIndex;
        int temp = table[startIndex];

        for (int x = startIndex; x < table.length; x++) {
            if (table[x] < temp) {
                temp = table[x];
                indexSmallest = x;
            }
        }
        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int x = 0; x < array.length; x++) {
            MainProgram.swap(array, x, indexOfSmallestFrom(array, x));
            System.out.println(Arrays.toString(array));
        }
    }
}
