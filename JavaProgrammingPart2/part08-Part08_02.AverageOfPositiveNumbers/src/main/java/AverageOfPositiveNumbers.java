import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, total = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }

            if (input > 0) {
                total += input;
                count++;
            }

        }

        if (total > 0) {
            double ave = 1.0 * total / count;
            System.out.println(ave);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
