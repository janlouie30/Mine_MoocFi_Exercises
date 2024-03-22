
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0, wins = 0, loses = 0;

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] parts = row.split(",");
                String home = parts[0];
                String away = parts[1];
                int homeP = Integer.parseInt(parts[2]);
                int awayP = Integer.parseInt(parts[3]);

                if (home.equals(team)) {
                    count++;
                    if (homeP > awayP) {
                        wins++;
                    } else {
                        loses++;
                    }
                } else if (away.equals(team)) {
                    count++;
                    if (awayP > homeP) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
            }

            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }
}
