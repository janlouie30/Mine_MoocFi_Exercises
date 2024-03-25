
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        // Create a Counter object with an initial value of 5
        Counter counter = new Counter(5);

        // Display the initial value of the counter
        System.out.println("Initial Counter Value: " + counter.value());

        // Increase the counter by 3
        counter.increase(3);
        System.out.println("Counter after increasing by 3: " + counter.value());

        // Decrease the counter by 2
        counter.decrease(2);
        System.out.println("Counter after decreasing by 2: " + counter.value());

        // Try to decrease the counter by a negative value (should have no effect)
        counter.decrease(-1);
        System.out.println("Counter after trying to decrease by -1: " + counter.value());
    }
}
