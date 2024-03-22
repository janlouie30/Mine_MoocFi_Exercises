import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
        Scanner reader = new Scanner(System.in);
        ArrayList<TelevisionProgram> tvProgs = new ArrayList<>();
        int time = 0;

        while (true) {
            System.out.print("Name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            time = Integer.parseInt(reader.nextLine());

            tvProgs.add(new TelevisionProgram(name, time));
        }

        System.out.print("Program's maximum duration? ");
        int input = Integer.parseInt(reader.nextLine());
        for (TelevisionProgram tvs : tvProgs) {
            if (tvs.getDuration() <= input) {
                System.out.println(tvs);
            }
        }
    }
}
