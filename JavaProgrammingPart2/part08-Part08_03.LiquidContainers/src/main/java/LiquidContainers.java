import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int value = Integer.parseInt(parts[1]);

            if (value > 0) {
                int tempFirst = first;
                int tempSecond = second;
                switch (parts[0]) {
                    case "add":
                        tempFirst += value;
                        if (tempFirst < 100) {
                            first += value;
                        } else {
                            first = 100;
                        }
                        break;
                    case "move":
                        if (value >= first) {
                            int amountToMove = value - (value - first);
                            second += amountToMove;
                            first -= amountToMove;
                        } else {
                            tempSecond += value;
                            tempFirst -= value;
                            if (tempFirst > 0) {
                                if (tempSecond < 100) {
                                    first -= value;
                                    second += value;
                                } else {
                                    second = 100;
                                    first = 0;
                                }
                            }
                        }

                        break;
                    case "remove":
                        tempSecond -= value;
                        if (tempSecond >= 0) {
                            second -= value;
                        } else {
                            second = 0;
                        }
                        break;
                    default:
                        System.out.println("ERROR: Unknown Command!");
                        break;
                }
                tempSecond = 0;
                tempFirst = 0;
            }

            System.out.println();

        }
    }

}
