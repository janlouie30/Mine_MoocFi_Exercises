import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here

        Timer timer = new Timer();
        int start = 0, end = 102;
        while (true) {
            // for (int x = start; x < end; x++) {
            System.out.println(timer);
            timer.advance();
        }
    }
}
